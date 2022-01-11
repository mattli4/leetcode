public class Solution45 {
    public int jump(int[] nums) {
        int n = nums.length;
        int [] minTimes = new int[n];
        for (int i = 0; i < n; i++) {
            minTimes[i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int internal = i - j;
                if (internal > nums[j]) {
                    continue;
                } else {
                    minTimes[i] = Math.min(minTimes[j] + 1, minTimes[i]);
                }
            }
        }
        return minTimes[n-1];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,0,1,4};
        new Solution45().jump(nums);
    }
}
