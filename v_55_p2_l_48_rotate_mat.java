import java.util.Arrays;

public class v_55_p2_l_48_rotate_mat {
    public static void main(String[] args) {
        v_55_p2_l_48_rotate_mat mn = new v_55_p2_l_48_rotate_mat();
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        mn.rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // Save the top element

                // Move left element to top
                matrix[first][i] = matrix[last - offset][first];

                // Move bottom element to left
                matrix[last - offset][first] = matrix[last][last - offset];

                // Move right element to bottom
                matrix[last][last - offset] = matrix[i][last];

                // Move top element to right
                matrix[i][last] = top;
            }
        }
        return true;
    }

 
}

