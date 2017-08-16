public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        int i = 0;
        while (n > 0){
            int j = n & 1;
            if(j == 1){
                i++;
            }
            n >>= 1;
        }
        if(i != 1) return false;
        else return true;
    }

    public static void main(String[] args) {
        boolean f = new Solution231().isPowerOfTwo(1026);
        System.out.println(f);
    }
}
