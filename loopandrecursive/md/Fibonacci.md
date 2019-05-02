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
   + [跳台阶](https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=13&tqId=11161&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)
     + 思路：第n级台阶是由n-1台阶走步长为1而来或n-2级台阶走步长为2而来
     + 代码：
     ```java
     /**
      * @author Chris Chetarget
      * @date 2019/5/2 下午1:25
      */
     public class JumpFloor {
         public int jumpFloor(int target){
             int frontTwo = 1;
             int frontOne = 2;
             if(target == 0){
                 return 0;
             }
             if (target == 1){
                 return 1;
             }
             if(target ==2){
                 return 2;
             }
             for(int i = 3; i<=target;i++){
                 int tmp = frontOne;
                 frontOne = frontTwo + tmp;
                 frontTwo = tmp;
             }
             return frontOne;
     
         }
     }

     ```
   + [变态跳台阶](https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tpId=13&tqId=11162&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)
     + 代码：
     ```java
     /**
      * @author Chris Chen
      * @date 2019/5/2 下午1:44
      */
     public class JumpFloor2 {
         public int jumpFloor2(int target) {
             if (target ==0){
                 return 0;
             }
             if(target==1){
                 return 1;
             }
             int ans=1;
             for(int i=1;i<target;i++){
                 ans = ans * 2;
             }
             return ans;
         }
     }

     ```
   + [矩形覆盖](https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)
     + 代码：
     ```java
     /**
      * @author Chris Chen
      * @date 2019/5/2 下午2:15
      */
     public class RectCover {
         public int rectCover(int target){
             if(target == 0){
                 return 0;
             }
             if(target ==1){
                 return 1;
             }
             if(target == 2){
                 return 2;
             }
             int frontTwo = 1;
             int frontOne = 2;
             for(int i = 3; i<=target;i++){
                 int tmp = frontOne;
                 frontOne = frontTwo + tmp;
                 frontTwo = tmp;
             }
             return frontOne;
         }
     }

     ```
   