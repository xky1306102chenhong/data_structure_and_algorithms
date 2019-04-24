import java.util.Scanner;

/**
 * @author Chris Chen
 * @date 2019/3/10 下午8:44
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        /* 比较length-1轮 */
        for (int i = 0; i < arr.length - 1; i++) {
            //每轮比较length-1-i次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int[] a = new int[5];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            a = bubbleSort(a);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
