import java.util.Arrays;

/**
 * Created by kvin on 3/10/16.
 */
public class QuickSort {

    public void sort(int[] arry) {
        quicksort(arry, 0, arry.length - 1);
    }


    public void quicksort(int[] arry, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arry, start, end);
            quicksort(arry, start, pivotIndex - 1);
            quicksort(arry, pivotIndex + 1, end);
        }
    }


    public static void main(String args[]) {
        int[] arry = {12, 9, 7, 15, 10};
        new QuickSort().sort(arry);
        System.out.println("Sorted array is " + Arrays.toString(arry));

    }

    private int partition(int[] arry, int start, int end) {


        int pivot = arry[end];
        //System.out.println("Pivot element is " +pivot);
        int i = start;


        for (int j = i; j <= arry.length - 1; j++) {

            if (arry[j] < pivot) {
                int temp = arry[i];
                arry[i] = arry[j];
                arry[j] = temp;
                i++;
            }

        }
        arry[end] = arry[i];
        arry[i] = pivot;
        return i;

    }

}










