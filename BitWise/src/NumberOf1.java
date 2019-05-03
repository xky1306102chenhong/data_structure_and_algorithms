import java.util.concurrent.Semaphore;

/**
 * @author Chris Chen
 * @date 2019/5/3 上午9:49
 */
public class NumberOf1 {
    public static int numberOf1(int n){
        int ans =0;
        while (n!=0){
            int tmp = n & 1;
            if(tmp==1){
                ans++;
            }
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numberOf1(-5));
        //System.out.println(-5>>1);
    }
}
