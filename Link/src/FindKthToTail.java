import java.util.ArrayDeque;

/**
 * @author Chris Chen
 * @date 2019/5/5 下午3:21
 * https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tqId=11167&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}

public class FindKthToTail {
    public ListNode findKthToTail(ListNode head,int k){
        ArrayDeque<ListNode> stack = new ArrayDeque<ListNode>();
        if(k == 0){
            return null;
        }
        if(head == null){
            return null;
        }
        while (head!=null){
            stack.push(head);
            head = head.next;
        }
        if(stack.size()<k){
            return null;
        }
        int i = 1;
        while (!stack.isEmpty() && i<k){
            stack.pop();
            i++;
        }
        ListNode ans = stack.pop();
        return ans;

    }

}
