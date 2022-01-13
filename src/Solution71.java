import java.util.Stack;

public class Solution71 {
    public String simplifyPath(String path) {
        StringBuffer sb = new StringBuffer();
        String [] seg = path.split("/");
        Stack<String> s = new Stack<>();
        for(String str : seg) {
            if (".".equals(str) || "".equals(str)) {
                continue;
            }else if("..".equals(str)) {
                if (!s.empty())
                s.pop();
            } else {
                s.push(str);
            }
        }
        if (s.size() == 0) return "/";
        for (int i = 0; i < s.size(); i++) {
            sb.append("/");
            sb.append(s.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new Solution71().simplifyPath("/../");
    }
}
