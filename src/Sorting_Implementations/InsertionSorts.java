package Sorting_Implementations;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kevin on 5/8/2017.
 */
public class InsertionSorts {
    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = new Random().nextInt(1000000) + 1;
        }

        System.out.println("Before insertion sort: \n" + Arrays.toString(a));

        long startTime = System.currentTimeMillis();
        long n = 0;

        for(int i = 1;i < a.length;i++) {
            int key = a[i];

            int j = i - 1;
            while(j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
                n++;
            }
            a[j + 1] = key;
            n++;
        }

        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;

        System.out.println("After insertion sort: \n" + Arrays.toString(a));
        System.out.println("Time: " + time);
        System.out.println("N: " + n);
    }
}
