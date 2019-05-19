import java.util.ArrayDeque;

/**
 * @author Chris Chen
 * @date 2019/5/19 下午4:36
 */
public class MyStack {

    /**
     * 数据栈
     */
    private ArrayDeque<Integer> stack1 = new ArrayDeque<>();
    /**
     * 辅助栈
     */
    private ArrayDeque<Integer> stack2 = new ArrayDeque<>();

    public void push(int node) {
        stack1.push(node);
        if(stack2.isEmpty()){
            stack2.push(node);
        }else {
            if(stack2.peek()>node){
                stack2.push(node);
            }else {
                stack2.push(stack2.peek());
            }
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(4);
        myStack.push(9);
        System.out.println(myStack.min());
    }
}
