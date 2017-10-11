import java.util.Scanner;

/**
 * Created by kevin on 6/13/2017.
 */
public class IsUnique_1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a word");
        String word = input.nextLine();

        System.out.println("Is string " + word + " unique? Answer is " + stringUnique(word));
    }
    public static boolean stringUnique(String word) {
        int[] alpha = new int[128];
        for(int i = 0;i < word.length();i++) {
            int temp = word.charAt(i);
            alpha[temp]++;
            if(alpha[i] > 1) {
                return false;
            }
        }
        return true;
    }
}
