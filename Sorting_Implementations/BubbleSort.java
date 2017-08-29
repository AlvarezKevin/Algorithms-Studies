package Sorting_Implementations;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kevin on 6/5/2017.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i = 0;i < a.length;i++) {
            a[i] = new Random().nextInt(50)+ 1;
        }

        int[] sortedA = bubbleSort(a);
    }

    public static int[] bubbleSort(int[] a) {
        for(int i = a.length - 1;i > 1;i--) {
            for(int j = 0;j < i;j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    System.out.println(Arrays.toString(a));
                }
            }
        }
        return a;
    }
}
