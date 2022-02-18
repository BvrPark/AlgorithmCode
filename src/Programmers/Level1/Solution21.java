package Programmers.Level1;

public class Solution21 {       //나머지가 1이 되는 수
    public int solution(int n) {
        int answer = 0;
        for(int i = 2;i<n;i++){     //어떤수를 2부터 차례대로 나눈다.
            if(n%i == 1){           // 그러다가 나머지가 1이 됐을 때
                answer = i;         // 그 수를 answer에 넣고
                break;              // 반복문 탈출
            }
        }
        return answer;
    }
}
