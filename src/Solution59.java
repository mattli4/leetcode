public class Solution59 {

    public int[][] generateMatrix(int n) {
        if (n == 1) return new int[][]{{1}};
        int [][] ret = new int[n][n];
        int count = n * n;
        int i = 0, j = 0, num = 0;
        char dir = 'r';
        while (true) {
            if(num == count) break;
            num++;
            ret[i][j] = num;
            if ('r' == dir) {
                j++;
                if (j >= n || ret[i][j] != 0) {
                    dir = 'd';
                    j--;
                    i++;
                }
            } else if ('d' == dir) {
                i++;
                if (i >= n || ret[i][j] != 0) {
                    dir = 'l';
                    i--;
                    j--;
                }
            } else if ('l' == dir) {
                j--;
                if (j < 0 || ret[i][j] != 0) {
                    dir = 'u';
                    j++;
                    i--;
                }
            } else if ('u' == dir) {
                i--;
                if (i < 0 || ret[i][j] != 0) {
                    dir = 'r';
                    j++;
                    i++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        new Solution59().generateMatrix(2);
    }
}
