import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution406 {
    public int[][] reconstructQueue(int[][] people) {
        int n = people.length;
        HashMap<Integer, ArrayList<Integer>> hp = new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<int []> list = new ArrayList<int []>();
        if(n == 0) return list.toArray(new int[0][0]);
        ArrayList<Integer> height = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int a = people[i][0];
            int b = people[i][1];
            if(hp.containsKey(a)){
                ArrayList<Integer> tmp = hp.get(a);
                tmp.add(b);
                hp.put(a, tmp);
            }else{
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                tmp.add(b);
                hp.put(a, tmp);
                height.add(a);
            }
        }
        Collections.sort(height);
        int size = height.size();

        for(int i = size - 1; i >= 0; i--){
            ArrayList<Integer> arr = hp.get(height.get(i));
            Collections.sort(arr);
            for(int j = 0; j < arr.size(); j++){
                int [] ele = new int [2];
                ele[0] = height.get(i);
                ele[1] = arr.get(j);
                list.add(ele[1], ele);
            }

        }
        return list.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        int [][] a = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        new Solution406().reconstructQueue(a);
    }
}
