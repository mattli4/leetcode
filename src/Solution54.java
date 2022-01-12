import java.util.ArrayList;
import java.util.List;

public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        int i = 0, j = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean [][] flag = new boolean[m][n];
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                flag[k][l] = false;
            }
        }
        char direct = 'r';
        while (true) {
            if (ret.size() == m * n) break;
            ret.add(matrix[i][j]);
            flag[i][j] = true;
            if ('r' == direct) {
                j++;
                if (j < 0 || j >= n || flag[i][j]) {
                    j--;
                    i++;
                    direct = 'd';
                }
            }else if ('d' == direct) {
                i++;
                if (i < 0 || i >= m || flag[i][j]){
                    i--;
                    j--;
                    direct = 'l';
                }
            }else if('l' == direct) {
                j--;
                if (j < 0 || j >= n || flag[i][j]) {
                    j++;
                    i--;
                    direct = 'u';
                }
            } else if ('u' == direct) {
                i--;
                if (i < 0 || i >= m || flag[i][j]){
                    i++;
                    j++;
                    direct = 'r';
                }
            }

        }
        return ret;
    }


    public static void main(String[] args) {
        int [][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        new Solution54().spiralOrder(matrix);
    }
}
