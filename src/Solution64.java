public class Solution64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(m == 0) return 0;
        for(int i = 1; i < m; i++)
            grid[0][i] += grid[0][i-1];
        for(int i = 1; i < n; i++)
            grid[i][0] += grid[i-1][0];
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                int a = grid[i][j] + grid[i-1][j];
                int b = grid[i][j] + grid[i][j-1];
                int c = a < b ? a : b;
                grid[i][j] = c;
            }
        }
        return grid[m-1][n-1];
    }

    public static void main(String[] args) {
        int [][]a = {{1,3,1},{1,5,1},{4,2,1}};
        new Solution64().minPathSum(a);
    }
}
