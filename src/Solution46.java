import java.util.ArrayList;
import java.util.List;

public class Solution46 {
    /*
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        int n = nums.length-1;
        permuteHelp(res, in, nums, 0);
        return res;
    }

    public void permuteHelp(List<List<Integer>> list, List<Integer> in, int[] nums, int s){
        if(in.size() == nums.length){
            list.add(in);
            return;
        }
        int n = nums[s];
        for (int i = 0; i <= in.size(); i++) {
            List<Integer> copy = new ArrayList<>(in);
            copy.add(i, n);
            permuteHelp(list, copy, nums, s +1);
        }
    }*/
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(n == 0) return res;
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        res.add(ans);
        for(int i = 1; i < n; i++){
            List<List<Integer>> newres = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                for(List<Integer> l: res){
                    List<Integer> newans = new ArrayList<>(l);
                    newans.add(j, nums[i]);
                    newres.add(newans);
                }
            }
            res = newres;
        }
        return res;
    }
    public static void main(String[] args) {
        int [] a = {1,2,3};
        new Solution46().permute(a);
    }

}
