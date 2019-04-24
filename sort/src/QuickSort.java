/**
 * @author Chris Chen
 * @date 2019/4/21 下午6:08
 */
public class QuickSort {

    public static int[] swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return arr;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if(arr[i]<arr[pivot]){
                swap(arr, index, i);
                index++;
            }
        }
        swap(arr, pivot, index-1);
        return index-1;
    }

    public static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex-1);
            quickSort(arr, partitionIndex+1, right);
        }
        return arr;
    }

    public static void main(String[] args){
        int[] a  = {4, 3, 6 ,5 ,2, 1};
        a = quickSort(a, 0, 5);
        for (int i=0; i< a.length; i++){
            System.out.println(a[i]);
        }
    }
}
