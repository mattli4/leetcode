public class Solution283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n == 0) return;
        int j = 0;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            if(num == 0){
                j = i;
                while(nums[j] == 0 && j < n - 1){
                    j++;
                }
                nums[i] = nums[j];
                nums[j] = 0;
                if(j == n-1) return;
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12,0};
        new Solution283().moveZeroes(nums);
    }
}
