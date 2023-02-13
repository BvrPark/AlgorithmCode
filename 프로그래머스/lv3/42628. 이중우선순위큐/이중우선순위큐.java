import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        int max = Integer.MIN_VALUE;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(String s : operations){
            String[] arr = s.split(" ");
            if(arr[0].equals("I")){
                int num = Integer.parseInt(arr[1]);
                if(max < num){
                    max = num;
                }
                q.offer(num);
            }else if(arr[0].equals("D")){
                if(q.isEmpty()){
                    continue;
                }
                if(arr[1].equals("1")){
                    q.remove(max);
                    max = Integer.MIN_VALUE;
                    
                }else if(arr[1].equals("-1")){
                    q.poll();
                }
            }
        }
        if(!q.isEmpty()){
            answer[0] = max;
            answer[1] = q.peek();
        }
        return answer;
    }
}