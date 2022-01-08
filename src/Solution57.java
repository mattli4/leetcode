import java.util.ArrayList;
import java.util.List;

public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> r = new ArrayList<>();

        int left = newInterval[0];
        int right = newInterval[1];
        boolean flag = false;
        for (int[] interval:intervals) {
         if (interval[0] > right) { //第一个出现左端点大于合并区间右端点，插入合并区间和该遍历到的区间
             if (!flag) {
                 r.add(new int[]{left, right});
                 flag = true;
             }
             r.add(interval);

         } else if (interval[1] < left) { //未到合并区间
             r.add(interval);
         } else { //区间合并
             left = Math.min(left, interval[0]);
             right = Math.max(right, interval[1]);
         }
        }
        if (!flag) //如合并区间还未被插入，则插入
            r.add(new int[]{left, right});
        int [][]res = new int[r.size()][];
        for (int i = 0; i < r.size(); i++) {
            res[i] = r.get(i);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
