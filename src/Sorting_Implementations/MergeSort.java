package Sorting_Implementations;

import java.util.Random;

/**
 * Created by Kevin on 5/9/2017.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = new int[10000];
        for (int i = 0; i < 10000; i++) {
            a[i] = new Random().nextInt(10000) + 1;
        }

        System.out.println("Before mergeSort sort:");
        printArray(a);

        long startTime = System.currentTimeMillis();

        int newA[] = mergeSort(a, 0, a.length - 1);

        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;

        System.out.println("\n============================================================\nAfter mergeSort sort:");
        printArray(a);
        System.out.println("\n\nTime: " + time);
    }

    private static int[] mergeSort(int[] a, int low, int high) {
        if (low >= high) {
            return null;
        }
        int mid = (low + high) / 2;

        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);

        int endLow = mid;
        int startHigh = mid + 1;

        while ((low <= endLow) && (startHigh <= high)) {
            if (a[low] < a[startHigh]) {
                low++;
            } else {
                int temp = a[startHigh];

                for (int i = startHigh - 1; i >= low; i--) {
                    a[i + 1] = a[i];
                }

                a[low] = temp;
                low++;
                endLow++;
                startHigh++;
            }
        }
        return a;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 30 == 0) {
                System.out.println();
            }
            System.out.print(a[i] + ", ");
        }
    }
}
