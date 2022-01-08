import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution89 {

    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 1<<n; i++) {
            res.add((i>>1)^i);
        }
        return res;
    }


    public static void main(String[] args) {
        new Solution89().grayCode(3);
    }
}
