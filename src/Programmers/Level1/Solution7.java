package Programmers.Level1;

public class Solution7 {
    public int solution(int[] a, int[] b) {
        int answer = 0;                 //내적의 결과를 담을 변수 생성
        for(int i = 0;i<a.length;i++){  //a배열의 길이만큼 반복
            answer += a[i]*b[i];        //a와 b배열을 내적하는 식 작성
        }
        return answer;
    }
}
