import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> m = new HashMap<>();
        int answer = 0;
        
        for(int i = 0; i < tangerine.length; i++){
            m.put(tangerine[i], m.getOrDefault(tangerine[i],0)+1);
        }
        
        ArrayList<Integer> keySet = new ArrayList<>(m.keySet());
        Collections.sort(keySet, new Comparator<Integer>(){
            @Override
            public int compare(Integer a1, Integer a2){
                return m.get(a2) - m.get(a1);
            }  
        });
        
        
        for(int i = 0; i < m.size(); i++){
            k = k - m.get(keySet.get(i));
            answer++;
            if(k <= 0){
                break;
            }
        }
        
        return answer;
    }
}