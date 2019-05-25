import java.util.ArrayDeque;

/**
 * @author Chris Chen
 * @date 2019/5/25 下午8:19
 */
public class IsPopOrder {
    public static boolean isPopOrder(int[] pushA, int[] popA){
        ArrayDeque<Integer> stack1 = new ArrayDeque<>();
        ArrayDeque<Integer> stack2 = new ArrayDeque<>();
        for(int i=popA.length-1; i>=0; i--){
            stack2.push(popA[i]);
        }
        for(int i=0; i<pushA.length; i++){
            stack1.push(pushA[i]);
            while (!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek().equals(stack2.peek())){
                stack1.pop();
                stack2.pop();
            }
        }
        if(!stack1.isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,3,5,2,1};
        System.out.println(isPopOrder(pushA, popA));
    }
}
