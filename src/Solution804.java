import java.util.HashMap;
import java.util.HashSet;

public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        int n = words.length;
        if (n == 0) return 0;
        String [] val = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Integer, String> hp = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < 26; i++){
            hp.put('a' + i, val[i]);
        }
        for(String str:words){
            String s = "";
            for(int i = 0; i < str.length(); i++){
                s += hp.get((int)str.charAt(i));
            }
            hs.add(s);
        }
        return hs.size();
    }

    public static void main(String[] args) {
        String []a = {"gin", "zen", "gig", "msg"};
        new Solution804().uniqueMorseRepresentations(a);
    }
}
