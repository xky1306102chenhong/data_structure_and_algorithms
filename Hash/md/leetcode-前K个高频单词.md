[前K个高频单词](https://leetcode-cn.com/problems/top-k-frequent-words/)
==================
+ 思路：先哈希再排序
+ 代码：  
```java
import java.util.*;

/**
 * @author Chris Chen
 * @date 2019/4/24 下午7:08
 */
public class TopKFrequent {
    public static List<String> topKFrequent(String[] words, int k){
        List<String> ans = new ArrayList<String>();
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for(String word: words){
            if(hashMap.get(word)!=null){
                int value = hashMap.get(word);
                hashMap.remove(word);
                hashMap.put(word, value + 1);
            }else{
                hashMap.put(word, 1);
            }
        }
        ArrayList<HashMap.Entry<String, Integer>> arrayList = new ArrayList<HashMap.Entry<String, Integer>>(hashMap.entrySet());
        arrayList.sort(new Comparator<HashMap.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o2.getValue().equals(o1.getValue())){
                    return o1.getKey().compareTo(o2.getKey());
                }else{
                    return o2.getValue() - o1.getValue() ;
                }

            }
        });
        int i = 0;
        for (HashMap.Entry<String, Integer> entry: arrayList){
            if(i >= k){
                break;
            }
            i++;
            ans.add(entry.getKey());
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        ArrayList<String> arrayList = null;
        arrayList = (ArrayList) topKFrequent(words, 3);
        for (String e: arrayList){
            System.out.println(e);
        }
    }
}

```