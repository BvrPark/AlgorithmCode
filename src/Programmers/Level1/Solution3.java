package Programmers.Level1;

public class Solution3 {
    public int solution(int[] absolutes, boolean[] signs) {     //absolutes : 절대값  signs : 부호
        int sum = 0;                                            //총 결과를 반환할 sum
        for(int i = 0;i<absolutes.length;i++){                  //어차피 absolutes나 signs이나 길이는 같으므로 상관없음
            sum += absolutes[i]*(signs[i]?1:-1);                //삼항 연산자를 이용해서 signs값이 양이면 절대값을 그대로 sum에 더하고
                                                                //signs 값이 음이면 -1을 곱해서 sum에 더한다.
        }
        return sum;
    }
}
