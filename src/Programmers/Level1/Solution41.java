package Programmers.Level1;

// 푸드 파이트 대회
public class Solution41 {
    public String solution(int[] food) {
        String answer = "0";                    //answer을 xxx0xxx형태로 만들어주기 위해 미리 0을 answer에 대입
        int food_n;                             //food의 갯수를 임시로 저장할 변수 생성
        for(int i = food.length-1; i >= 1;i--){ //for문 안의 이유는 블로그에 기재
            food_n = food[i]/2;                 
            for(int j = 0; j<food_n;j++){
                answer = i + answer + i;
            }
        }
        return answer;
    }

}
