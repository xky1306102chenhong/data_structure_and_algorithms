/**
 * @author Chris Chen
 * @date 2019/5/3 上午9:49
 */
public class NumberOf1 {
    public static int numberOf1(int n){
        int ans =0;
        int flag = 1;
        while (flag != 0){
            int tmp = n & flag;
            if(tmp==flag){
                ans++;
            }
            flag=flag<<1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numberOf1(-5));
        //System.out.println(-5>>1);
    }
}
