package Programmers.Level2;

public class Solution35 {
    public int solution(int n, int a, int b) {      //예상대진표
        int answer = 0;                 // 라운드 수
        boolean loop = true;            // 반복문을 컨트롤할 변수 생성
        while (loop) {
            answer++;                   // 반복문이 진행되면 라운드 수를 증가시킴
            if (a % 2 == 0) {           // a가 짝수일때, 그 다음 라운드로 올라갈 시, 가지는 숫자
                a = a / 2;
            } else if (a % 2 == 1) {    // a가 홀수일때, 가지는 숫자
                a = a / 2 + 1;
            }
            if (b % 2 == 0) {           // b가 짝수일때, 가지는 숫자
                b = b / 2;
            } else if (b % 2 == 1) {    // b가 홀수일때, 가지는 숫자
                b = b / 2 + 1;
            }
            if(a == b){                 // 만약에 a와 b가 같으면 같은 라운드에서 붙은 것이므로 반복문 종료
                loop = false;
            }
        }

        return answer;
    }
}
