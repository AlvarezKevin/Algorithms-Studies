package Search;

import Sorting_Implementations.BubbleSort;
import Sorting_Implementations.InsertionSorts;

import java.util.Random;


/**
 * Created by Kevin on 6/5/2017.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[100];
        for(int i = 0;i < a.length;i++) {
            a[i] = new Random().nextInt(50)+ 1;
        }

        a = BubbleSort.bubbleSort(a);

        int val = new Random().nextInt(50) + 1;
        System.out.println("Found value " + val + " at index " + binarySearch(val,a));

    }

    //Runtime is O(log n)
    //Divides array up by half each iteration till it finds the target value
    public static int binarySearch(int val, int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = (high + low) /2;

            if(a[middle] < val) {
                low = middle + 1;
            }else if(a[middle] > val) {
                high = middle -1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
