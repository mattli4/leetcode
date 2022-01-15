public class Solution97 {

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        if ("".equals(s1)) return s2.equals(s3);
        if ("".equals(s2)) return s1.equals(s3);
        int m = s1.length(), n = s2.length();
        boolean [][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i > 0 && dp[i - 1][j] && s3.charAt(i + j - 1) == s1.charAt(i-1)) {
                    dp[i][j] = true;
                }
                if (j > 0 && dp[i][j-1] && s3.charAt(i + j - 1) == s2.charAt(j-1)) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        boolean ret = new Solution97().isInterleave("aa", "ab", "abaa");
        System.out.println(ret);
    }
}
