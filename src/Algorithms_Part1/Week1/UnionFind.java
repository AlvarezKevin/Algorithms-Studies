package Algorithms_Part1.Week1;

import java.util.Scanner;

/**
 * Created by Kevin on 6/26/2017.
 */
public class UnionFind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        QuickFindUF quickFindUF = new QuickFindUF(n);

        while (scanner.hasNextInt()) {

            int p = scanner.nextInt();
            int q = scanner.nextInt();

            if (!quickFindUF.connected(p, q)) {
                quickFindUF.union(p, q);
                System.out.println(p + " " + q);
            }
        }

    }
}
