package CTCI_Chapter1_Arrays_Strings;

import java.util.LinkedList;
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
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        for(int i = 1;i < word.length();i++) {
            if(word.charAt(i) == word.charAt(i - 1)) {
                list.set(list.size() - 1,list.get(list.size() -1) + 1);
            }else {
                list.add(1);
            }
        }

        StringBuilder builder = new StringBuilder();

        int j = 0;
        for(int item : list) {
            builder.append(word.charAt(j));
            builder.append(item);
            j += item;
        }

        if(j == word.length()) {
            return word;
        }

        return builder.toString();
    }
}
