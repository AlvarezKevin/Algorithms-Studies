import java.util.Scanner;

/**
 * Created by Kevin on 5/22/2017.
 */
public class StringCompression_1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");

        String word = input.nextLine();

        input.close();

        String compressedWord = compress(word);

        System.out.println("The compressed word is: " + compressedWord);
    }

    public static String compress(String word) {
        int con = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            con++;
            if (i + 1 >= word.length() || word.charAt(i) != word.charAt(i + 1)) {
                builder.append(word.charAt(i));
                builder.append(con);
                con = 0;
            }
        }

        return builder.length() < word.length() ? builder.toString() : word;
    }
}
