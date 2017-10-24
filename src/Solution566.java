public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int w = nums.length;
        int l = nums[0].length;
        if(r * c != w * l) return nums;
        int [][] newNums = new int[r][c];
        int m = 0;
        int n = 0;
        for(int i = 0; i < w; i++){
            for(int j = 0; j < l; j++){
                newNums[m][n] = nums[i][j];
                n++;
                if(n >= c){
                    m++;
                    m = m % r;
                }
                n = n % c;
            }
        }
        return newNums;
    }

    public static void main(String[] args) {
        int [][] a = {{1,2,3,4,5,6}};
        int [][] b = new Solution566().matrixReshape(a, 3,2);
    }
}
