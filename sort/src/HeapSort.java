/**
 * @author Chris Chen
 * @date 2019/4/22 上午1:30
 */
public class HeapSort {

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j]=tmp;
    }

    /*
    堆调整
     */
    public static void heapify(int[] arr, int i,int len){
        //int len = arr.length;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left<len ){
            if(arr[left]>arr[largest]){
                largest = left;
            }

        }

        if (right < len ){
            if(arr[right]>arr[largest]){
                largest = right;
            }
        }

        if(largest != i){
            swap(arr, largest, i);
            heapify(arr, largest, len);
        }

    }

    /*
    1. 建立最大顶堆
     */
    public static void buildMaxHeap(int[] arr, int len){
        //int len = arr.length;
        for (int i=len/2;i>=0;i--){
            heapify(arr,i, len);
        }
    }


    public static int[] heapSort(int[] arr){
        int len = arr.length;
        buildMaxHeap(arr, len);


        for (int i=arr.length-1;i>0;i--){
            swap(arr,0, i);
            len--;
            heapify(arr, 0, len);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a={98,78,7777,69};
        a = heapSort(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
