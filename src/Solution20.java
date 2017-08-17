import java.util.Stack;

/*
    reference: phoenix13steve

    public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}
 */

public class Solution20 {
    public boolean isValid(String s) {
        Stack <Character>stack = new Stack<Character>();
        char[] str = s.toCharArray();
        for (char c : str) {
            if(c == '(') {
                stack.push(c); continue;
            }
            if(c == '[') {
                stack.push(c); continue;
            }
            if(c == '{') {
                stack.push(c); continue;
            }
            if(!stack.empty()){
                char cc = stack.pop();
                if(cc == '('){
                    if(c == ')') continue; else return false;
                }
                if(cc == '['){
                    if(c == ']') continue; else return false;
                }
                if(cc == '{'){
                    if(c == '}') continue; else return false;
                }
            }
            if(stack.empty()) return false;
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        boolean f = new Solution20().isValid("][]})");
        System.out.println(f);
    }
}
