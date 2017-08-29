package CTCI_Chapter1_Arrays_Strings;

import java.util.Scanner;

/**
 * Created by Kevin on 5/8/2017.
 */
public class URLify_1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your sentence: ");
        String original = input.nextLine();

        System.out.println("True length of string: ");
        int len = input.nextInt();

        input.close();

        System.out.println("MY URL: " + myImplementation(original,len));
    }

    public static String myImplementation(String original, int len) {
        original = original.substring(0, len);

        char[] sentence = original.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(sentence[i]);
            }
        }
        return stringBuilder.toString();
    }
}
