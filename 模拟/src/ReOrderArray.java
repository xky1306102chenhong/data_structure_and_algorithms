import java.util.ArrayDeque;
/**
 * @author Chris Chen
 * https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */

public class ReOrderArray {
    public void reOrderArray(int [] array) {
        ArrayDeque<Integer> queueOdd = new ArrayDeque<Integer>(array.length);
        ArrayDeque<Integer> queueEven = new ArrayDeque<Integer>(array.length);
        for (int i=0; i<array.length; i++){
            if(array[i]%2==1){
                queueOdd.offer(array[i]);
            }else {
                queueEven.offer(array[i]);
            }
        }
        int i=0;
        while (!queueOdd.isEmpty()){
            array[i++] = queueOdd.poll();
        }
        while (!queueEven.isEmpty()){
            array[i++] = queueEven.poll();
        }
    }

}