public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int t = 0;
        while (s <= e){
            t = (s + e) / 2;
            if(nums[t] <= target){
                s = t + 1;
            }
            if(nums[t] > target){
                e = t - 1;
            }
            if(nums[t] == target){
                return t;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int [] nums = {1};
        int t = new Solution35().searchInsert(nums, 3);
        System.out.println(t);
    }
}
