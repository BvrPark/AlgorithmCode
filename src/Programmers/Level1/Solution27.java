package Programmers.Level1;

public class Solution27 {           //콜라츠 추측
    public int solution(long num) {
        int answer = 0;
        while (num != 1) {          //결과로 나온수가 1이 될때까지 반복
            if (answer == 500) {    //500번 반복했을 때, -1반환
                return -1;
            }
            num = (num % 2 == 0 ? num / 2 : (num * 3) + 1); //짝수일때 2로 나누고 홀수면 3곱하고 1을 더함
            answer++;               //반복할때마다 1증가
        }
        return answer;
    }
}
