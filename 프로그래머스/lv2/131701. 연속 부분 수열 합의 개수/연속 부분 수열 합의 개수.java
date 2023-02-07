import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int idx = 0;
        int sum = 0;
        int length = 1;
        int count = 1;
        int n = elements.length;
        Set<Integer> s = new HashSet<>();
        
        while(count <= n){
            for(int i = 0; i < n; i++){
                idx = i;
                while(length > 0){
                    sum += elements[idx++];
                    length--;
                    if(idx > n-1){
                        idx = idx%n;
                    }
                }
                length = count;
                s.add(sum);
                sum = 0;
            }
            count++;
            length = count;
        }
        return s.size();
    }
}