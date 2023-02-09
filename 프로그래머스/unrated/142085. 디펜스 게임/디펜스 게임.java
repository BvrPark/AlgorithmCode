import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        if(k >= enemy.length){
            return enemy.length;
        }
        
        for(int i = 0; i < enemy.length; i++){
            q.add(enemy[i]);
            if(q.size() > k){
                n -= q.poll();
            }
            if(n < 0){
                return i;
            }
        }
        
        return enemy.length;
    }
}