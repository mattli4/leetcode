import java.util.ArrayList;
import java.util.List;

public class Solution500 {
    public String[] findWords(String[] words) {
        String one = "qwertyuiop";
        String two = "asdfghjkl";
        String three = "zxcvbnm";
        boolean o = false;
        boolean tw = false;
        boolean thr = false;
        List<String> res = new ArrayList<String>();
        int j = 0;
        for(String str:words){
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                String cc = ""+c;
                cc = cc.toLowerCase();
                if(one.contains(cc))
                    o = true;
                if(two.contains(cc))
                    tw = true;
                if(three.contains(cc))
                    thr = true;
            }
            if((o&&!tw&&!thr)||(!o&&tw&&!thr)||(!o&&!tw&&thr)){
                res.add(str);
                j++;
            }
            o = false;
            tw = false;
            thr = false;
        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] s = {"Dad","Hello","Alaska","Peace"};
        new Solution500().findWords(s);
    }
}
