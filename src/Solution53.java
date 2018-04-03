public class Solution53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int res = 0;
        int []sum = new int[n];
        res = nums[0];
        sum[0] = nums[0];
        for(int i = 1; i < n; i++){
            sum[i] = Math.max(sum[i-1] + nums[i], nums[i]);
            res = Math.max(res, sum[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] a = {1,2};
        new Solution53().maxSubArray(a);
    }
}
