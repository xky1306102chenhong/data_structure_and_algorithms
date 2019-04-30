import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @author Chris Chen
 * @date 2019/4/30 上午9:42
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class PrintListFromTailToHead {

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ArrayList<Integer> arrayList = printListFromTailToHead(listNode);
        for (Integer e: arrayList){
            System.out.println(e);
        }
    }

}
