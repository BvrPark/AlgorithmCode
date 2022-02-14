package Programmers.Level1;

public class Solution19 {           // 자릿수 더하기
    public int solution(int n) {
        int answer = 0;
        while(n!=0){                // n이 0일때 반복문 탈출
            answer += n%10;         // n을 10으로 나눈 나머지를 answer에 더해줌
            n = n/10;               // n을 10으로 나눈 몫을 n으로 바꿈
        }
        return answer;
    }
}
