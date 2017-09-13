public class Solution628 {
    public int maximumProduct(int[] nums) {
        int n = nums.length - 1;
        int [] num = quicksort(nums, 0, n);
        int one = num[n];
        int two1 = num[n - 1] * num[n - 2];
        int two2 = num[0] * num[1];
        int two = two1 > two2 ? two1 : two2;    //两荤一素or两素一荤
        return one * two;
    }

    public int [] quicksort(int[] nums, int s, int e){
        int i = s;
        int j = e;
        if(i >= j) return nums;
        int key = nums[s];
        while(i < j){
            while(i < j && key <= nums[j])
                j--;
            nums[i] = nums[j];
            while(i < j && nums[i] <= key)
                i++;
            nums[j] = nums[i];
        }
        nums[i] = key;
        quicksort(nums, s, i - 1);
        quicksort(nums, j + 1, e);
        return nums;
    }

    public static void main(String[] args) {
        int [] num = {4,3,2,5,6,7,1,9,10};
        int sort = new Solution628().maximumProduct(num);
        System.out.println(sort);
    }
}
