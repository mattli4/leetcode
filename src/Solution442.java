import java.util.LinkedList;
import java.util.List;

public class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {       //用数组内容当下标
        int n = nums.length;
        List<Integer> list = new LinkedList<>();
        if(n < 1) return list;
        int len = n + 1;
        int []times = new int[len];
        for(int i = 0; i < n; i++){
            times[nums[i]]++;
        }
        for(int j = 1; j < len; j++){
            if(times[j] == 2){
                list.add(j);
            }
        }
        return list;
    }
}
