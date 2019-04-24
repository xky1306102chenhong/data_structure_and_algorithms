/**
 * @author Chris Chen
 * @date 2019/4/22 上午12:27
 */
public class SelectionSort {

    public static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 5, 6, 2, 1};
        a = selectionSort(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
