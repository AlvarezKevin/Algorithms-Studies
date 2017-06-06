package Sorting_Implementations;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kevin on 5/8/2017.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = new Random().nextInt(1000000) + 1;
        }

        System.out.println("Before selection sort: \n" + Arrays.toString(a));

        long startTime = System.currentTimeMillis();

        a = selectionSort(a);

        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;

        System.out.println("After selection sort: \n" + Arrays.toString(a));
        System.out.println("Time: " + time);

    }

    public static int[] selectionSort(int[] a) {
        //Selection Sort O(n^2)
        long n = 0;

        for (int i = 0; i < a.length; i++) {

            int minPos = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minPos]) {
                    minPos = j;
                }
                n++;
            }

            int temp = a[i];
            a[i] = a[minPos];
            a[minPos] = temp;

            n++;
        }
        System.out.println("N: " + n);
        return a;
    }
}

