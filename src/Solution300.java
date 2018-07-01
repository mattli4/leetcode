public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int [] idx = new int[n];
        for(int i = 0; i < n; i++){
            idx[i] = 1;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    int tmp = idx[j] + 1;
                    if(tmp > idx[i]){   //update when above old value
                        idx[i] = tmp;
                    }
                }
            }
        }
        int res = idx[0];
        for(int i = 1; i < n; i++){
            if(res < idx[i])
                res = idx[i];
        }
        return res;
    }


    public static void main(String[] args) {
        int []a = {1,3,6,7,9,4,10,5,6};
        new Solution300().lengthOfLIS(a);
    }
}
