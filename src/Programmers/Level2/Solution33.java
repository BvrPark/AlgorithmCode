package Programmers.Level2;

public class Solution33 {           // 2xn타일링 문제
    public int solution(int n) {
        int[] com = new int[n+1];   // 입력한 길이보다 1많게 배열 생성
        com[1] = 1;                 // 길이가 1일때, 경우의 수
        com[2] = 2;                 // 길이가 2일때, 경우의 수
        for(int i = 3; i <=n ;i++){ // 길이가 3이상일 때, 경우의 수
            com[i] = (com[i-1]+com[i-2])%1000000007;
        }
        return com[n];
    }
}
