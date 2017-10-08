import java.util.Stack;

public class Solution476 {
    public int findComplement(int num) {
        if(num == 0) return 1;
        Stack<Integer> s = new Stack<>();
        while(num > 0){
            int b = num & 1;
            int pb = (b == 0) ? 1:0;
            s.push(pb);
            num >>= 1;
        }
        int n = 0;
        while(!s.empty()){
            n <<= 1;
            int m = s.pop();
            n += m;
        }
        return n;
    }

    public static void main(String[] args) {
        new Solution476().findComplement(5);
    }
}
