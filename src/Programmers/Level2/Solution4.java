package Programmers.Level2;

public class Solution4 {
    public long solution(int n) {       //피보나치 수
        long prev1 = 1L, prev2 = 1L;
        long answer = 1L;
        if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else{
            for(int i = 2;i<n;i++){
                answer = prev1%1234567 + prev2%1234567;
                prev1 = prev2;
                prev2 = answer;
            }
        }
        return answer%1234567;
    }
}
