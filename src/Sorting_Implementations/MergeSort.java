package Sorting_Implementations;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kevin on 5/9/2017.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new Random().nextInt(1000000) + 1;
        }

        System.out.println("Before merge sort: \n" + Arrays.toString(a));

        long startTime = System.currentTimeMillis();

        int newA[] = merge(a);

        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;

        System.out.println("After merge sort: \n" + Arrays.toString(newA));
        System.out.println("Time: " + time);
    }

    private static int[] merge(int[] a,int p, int r) {
       //TODO Implement
    }
}
