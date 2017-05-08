package CTCI_Chapter1_Arrays_Strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kevin on 5/8/2017.
 */
public class CheckPermutation_1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string");
        String a = input.nextLine();
        System.out.println("Enter second string");
        String b = input.nextLine();

        input.close();

        System.out.println("Original Strings: \na: " + a + "\nb: " + b);
        System.out.println("Are they permutations? " + checkPerms(a, b));
    }

    //My attempt
    private static boolean checkPerms(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        //Makes strings into char arrays, easier to iterate through
        char ar[] = a.toCharArray();
        char br[] = b.toCharArray();

        //Adds one string to hashmap
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            map.put(ar[i], i);
        }

        for (int i = 0; i < br.length; i++) {
            if (map.containsKey(br[i])) {
                map.remove(br[i]);
            } else {
                return false;
            }
        }
        return true;
    }
}
