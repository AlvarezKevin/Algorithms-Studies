package Search;

import java.util.Random;

/**
 * Created by Kevin on 6/5/2017.
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] a = new int[100];
        for(int i = 0;i < a.length;i++) {
            a[i] = new Random().nextInt(50)+ 1;
        }

        linSearch(new Random().nextInt(50) + 1,a);
    }
    public static void linSearch(int val, int[] a) {
        for(int i = 0;i < a.length;i++) {
            if(a[i] == val) {
                System.out.println("Found value " + val + " at index " + i);
            }
        }
    }
}
