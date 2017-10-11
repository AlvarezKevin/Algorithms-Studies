import java.util.Scanner;

/**
 * Created by Kevin on 10/10/2017.
 */
public class OneAway_1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();

        System.out.println(oneAway(a, b));
    }

    public static boolean oneAway(String a, String b) {
        int[] aLetters = new int[128];
        int[] bLetters = new int[128];
        for(int i = 0;i < a.length();i++) {
            aLetters[a.charAt(i)]++;
        }
        for(int i = 0;i < b.length();i++) {
            bLetters[b.charAt(i)]++;
        }
        int differences = 0;
        for(int i = 0;i < aLetters.length;i++) {
            if(aLetters[i] != bLetters[i]) {
                differences++;
            }
        }

        return differences <= 1;
    }
}
