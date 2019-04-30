[从尾到头打印链表](https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)
================

+ 思路：使用栈ArrayDeque
+ 代码：
```java
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @author Chris Chen
 * @date 2019/4/30 上午9:42
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class PrintListFromTailToHead {

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ArrayList<Integer> arrayList = printListFromTailToHead(listNode);
        for (Integer e: arrayList){
            System.out.println(e);
        }
    }

}

```

