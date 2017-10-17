/**
 * Created by Kevin on 10/16/2017.
 */
public class RotateMatrix_1_7 {
    public static void main(String[] args) {

    }

    public static void rotate(int[][] matrix) {
        for(int i = 0;i < matrix.length / 2;i++) {
            int first = i;
            int end = matrix.length - 1 - i;
            for(int j = first;j < end;i++) {
                int offset = j - first;

                int temp = matrix[first][j];

                matrix[first][j] = matrix[end - offset][first];
                matrix[end - offset][first] = matrix[end][end - offset];
                matrix[end][end - offset] = matrix[j][end];
                matrix[j][end] = temp;
            }
        }
    }
}
