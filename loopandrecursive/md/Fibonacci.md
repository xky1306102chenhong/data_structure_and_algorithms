Fibonacci问题
=================

+ 例题
  + [斐波那契数列](https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)
    + 时间复杂度 O(n)
    + 代码：
    ```java
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

    ```