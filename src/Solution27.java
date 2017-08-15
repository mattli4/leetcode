public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        for (; i < n; i++) {
            if (nums[i] == val){
                nums[i] = nums[n-1];
                n--;
                i = -1;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int []nums = {3,2,2,3};
        int a = new Solution27().removeElement(nums, 3);
        System.out.println(a);
    }
}
