package Programmers.Level2;

public class Solution33 {           // 2xn타일링 문제
    public int solution(int n) {
        int[] com = new int[n+1];
        com[1] = 1;
        com[2] = 2;
        for(int i = 3; i <=n ;i++){
            com[i] = (com[i-1]+com[i-2])%1000000007;
        }
        return com[n];
    }
}
