import java.util.*;

public class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int num:nums){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer, Integer> entry:countMap.entrySet()){
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();
        }
        List<Integer> list = new LinkedList<>();
        while(pq.size()>0){
            list.add(0, pq.poll().getKey());
        }
        return list;
    }

    public static void main(String[] args) {
        int [] a = {1,1,1,2,2,3};
        new Solution347().topKFrequent(a, 2);
    }
}
