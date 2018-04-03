public class Solution647 {
    public int countSubstrings(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int count = 0;
        char [] arr = s.toCharArray();
        int [][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = i; j >= 0; j--){
                if(i == j){
                    dp[j][i] = 1;
                    count += 1;
                    continue;
                }
                if(i - j == 1){
                    if(arr[i] == arr[j]){
                        dp[j][i] = 1;
                        count += 1;
                    }
                }else{
                    if(arr[i] == arr[j] && dp[j+1][i-1] == 1){
                        dp[j][i] = 1;
                        count += 1;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new Solution647().countSubstrings("abcba");
    }
}
