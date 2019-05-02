import java.util.Stack;

/**
 * @author Chris Chen
 * @date 2019/5/2 上午11:02
 */
public class PushAndPopForQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if(!stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack1.pop();
            }
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
        stack1.push(node);
    }

    public int pop() {
        if(!stack1.isEmpty()){
            while (!stack2.isEmpty()){
                stack2.pop();
            }
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
