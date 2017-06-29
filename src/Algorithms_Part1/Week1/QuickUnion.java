package Algorithms_Part1.Week1;

/**
 * Created by Kevin on 6/27/2017.
 */
public class QuickUnion {
    private int[] id;

    public QuickUnion(int n) {
        id = new int[n];
        for(int i = 0;i < n;i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i) {
        while(i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public int count() {
        return id.length;
    }
}
