public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        if(len < 1) return 0;
        int max = 0;
        int tmp = 0;
        for(int i = 0; i < len; i++){
            int n = nums[i];
            if(n == 0) {
                if(tmp > max)
                    max = tmp;
                tmp = 0;
                continue;
            }
            if(n == 1){
                tmp++;
            }
        }
        return tmp > max ? tmp:max;     //两者取其大
    }
}
