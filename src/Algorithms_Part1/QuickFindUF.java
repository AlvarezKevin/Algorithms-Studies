package Algorithms_Part1;

/**
 * Created by Kevin on 6/27/2017.
 */
public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int n) {
        id = new int[n];
        for(int i = 0;i < n;i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        int pID = id[p];
        int qID = id[q];

        for(int i = 0;i < id.length;i++) {
            if(id[i] == pID) {
                id[i] = qID;
            }
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public int find(int p) {
        return 0;
    }

    public int count() {
        return id.length;
    }
}
