package Programmers.Level1;

public class Solution10 {
    public int solution(int left, int right) {
        int answer = 0;                         //return할 값
        for (int i = left; i <= right; i++) {   //left범위에서 right범위까지 반복
            if(devisor(i)%2 == 0){              //약수의 갯수가 짝수일 때
                answer += i;                    //그때의 숫자 i를 더해주고
            }else if(devisor(i)%2 != 0){        //약수의 갯수가 홀수일 때
                answer -= i;                    //그때의 숫자 i를 빼준다.
            }
        }
        return answer;
    }

    public int devisor(int n) {         //약수의 갯수를 세는 메서드
        int count = 0;                  //약수의 갯수
        for (int i = 1; i <= n; i++) {  //반복문으로 돌렸을때 n을 1~n까지 나눴을 때 나머지가 0이 되면 약수가 있는 것이므로
            if (n % i == 0) {           //그때 약수의 갯수를 1증가 시켜줌
                count++;
            }
        }
        return count;
    }
}
