/**
 * @author Chris Chen
 * @date 2019/5/5 下午4:30
 * https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&tqId=11169&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class MergeLink {
    public ListNode merge(ListNode list1, ListNode list2){
        if (list1 ==null && list2 == null){
            return null;
        }else if (list1 != null && list2 ==null){
            return list1;
        } else if(list1 == null && list2!=null){
            return list2;
        }
        ListNode node = null;
        if(list1.val<=list2.val){
            node = new ListNode(list1.val);
            list1 = list1.next;
        }else{
            node = new ListNode(list2.val);
            list2 = list2.next;
        }
        ListNode head = node;
        while (list1!=null && list2!=null){
            if(list1.val<=list2.val){
                node.next = list1;
                list1 = list1.next;
            }else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        if (list1 ==null && list2 == null){
            node.next = null;
            return head;
        }else if (list1 != null && list2 ==null){
            node.next = list1;
            return head;
        } else{
            node.next = list2;
            return head;
        }
    }
}
