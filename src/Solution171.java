public class Solution171 {
    public int titleToNumber(String s) {
        int n = s.length();
        int num = 0;
        int exp = n - 1;
        for (int i = 0; i < n; i++) {
            int in = s.charAt(i)- 'A' + 1;
            num += in * Math.pow(26, exp--);
        }
        return num;
    }

    public static void main(String[] args) {
        int n = new Solution171().titleToNumber("BA");
        System.out.println(n);
    }
}
