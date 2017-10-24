public class Solution198 {
    public int rob(int [] nums){
        int n = nums.length;
        if(n < 1) return 0;
        int []money = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0){
                    money[j] = nums[0];
                }
                if(j == 1){
                    int max = Math.max(nums[0], nums[1]);
                    money[j] = max;
                }
                if(j > 1) {
                    int pre = money[j - 1];
                    int cur = nums[j] + money[j - 2];
                    int max = Math.max(pre, cur);
                    money[j] = max;
                }
            }
        }
        return money[n-1];
    }

    public static void main(String[] args) {
        int []house = {2,1,4,5,3,6,7,8};
        int m = new Solution198().rob(house);
        System.out.println(m);
    }
}
