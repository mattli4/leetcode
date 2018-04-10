import java.util.ArrayList;
import java.util.List;

public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        int sl = s.length();
        int pl = p.length();
        List<Integer> list = new ArrayList<>();
        if(sl == 0 || pl == 0) return list;
        char []pc = p.toCharArray();
        for(int i = 0; i < sl - pl + 1; i++){
            String str = s.substring(i, i + pl);
            char []sc = str.toCharArray();
            int [] charac = new int[26];
            for(int j = 0; j < pl; j++){
                charac[pc[j]-'a']++;
            }
            boolean f = true;
            for(int k = 0; k < pl; k++){
                charac[sc[k]-'a']--;
                if(charac[sc[k]-'a'] < 0) f = false;
            }
            if(f){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        new Solution438().findAnagrams("af", "be");
        System.out.println('0'^'5');
        System.out.println('1'^'4');
    }
}
