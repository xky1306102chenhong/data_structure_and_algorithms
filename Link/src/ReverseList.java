import java.util.ArrayDeque;

/**
 * @author Chris Chen
 * @date 2019/5/5 下午3:44
 * https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=13&tqId=11168&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class ReverseList {
    public ListNode reverseList(ListNode head){
        if (head == null){
            return null;
        }
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        while (head!=null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode node = new ListNode(stack.pop());
        ListNode newHead = node;
        while (!stack.isEmpty()){
            node.next = new ListNode(stack.pop());
            node = node.next;
        }
        node.next=null;
        return newHead;
    }
}
