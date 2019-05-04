/**
 * @author Chris Chen
 * @date 2019/5/4 下午9:10
 * 数值的整数次方(https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&tqId=11165&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)
 */
public class Power {
    public static double power(double base, int exponent){

        if(exponent == 0){
            return 1.0;
        }else if(exponent > 0){
            double ans = 1;
            for(int i=0; i< exponent;i++){
                ans *= base;
            }
            return ans;
        }else {
            double ans = 1;
            int tmp = -exponent;
            for(int i=0; i< tmp;i++){
                ans *= base;
            }
            return 1/ans;
        }
    }

    public static void main(String[] args) {
        double ans = power(2, -3);
        System.out.println(ans);
    }
}