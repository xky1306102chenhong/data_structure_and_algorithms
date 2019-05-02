/**
 * @author Chris Chen
 * @date 2019/5/2 下午12:14
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        int frontTwo = 0;
        int frontOne = 1;
        if(n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        for(int i = 2; i<=n;i++){
            int tmp = frontOne;
            frontOne = frontTwo + tmp;
            frontTwo = tmp;
        }
        return frontOne;
    }
}
