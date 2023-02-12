import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs, new Comparator<int[]>(){
            @Override
            public int compare(int[] i1, int[] i2){
                if(i1[0] == i2[0]){
                    return i1[1] - i2[1];
                }
                return i1[0] - i2[0];
            }
        });
        
        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] i1, int[] i2){
                return i1[1] - i2[1];
            }
        });
        
        q.add(jobs[0]);
        int end = jobs[0][0];
        int sum = 0;
        int idx = 1;
        
        while(!q.isEmpty()){
            int[] arr = q.poll();
            end += arr[1];
            sum += end - arr[0];
            
            while(idx < jobs.length && jobs[idx][0] <= end){
                q.add(jobs[idx++]);
            }
            
            if(idx < jobs.length && q.isEmpty()){
                end = jobs[idx][0];
                q.add(jobs[idx++]);
            }
        }
        return sum/jobs.length;
    }
}