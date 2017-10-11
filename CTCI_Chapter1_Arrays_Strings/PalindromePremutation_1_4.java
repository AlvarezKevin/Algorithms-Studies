import java.util.Scanner;

/**
 * Created by Kevin on 10/10/2017.
 */
public class PalindromePremutation_1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.println(hasPalindrome(word));
    }

    public static boolean hasPalindrome(String word) {

        int[] a = new int[128];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                a[word.charAt(i)]++;
            }
        }
        int oddCount = 0;
        for(int i =0;i < a.length;i++) {
            if(a[i] % 2 == 1) {
                oddCount++;
            }
            if(oddCount > 1) {
                return false;
            }
        }
        return true;

    }
}
