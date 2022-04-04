package Programmers.Level2;

public class Solution22 {
    public int[] solution(int n, long left, long right) {   //n^2배열 자르기
        int[] answer = new int[(int)(right-left)+1];        //left index부터 right index까지 저장할 배열 생성
        int cnt = 0;                                        //answer의 index값을 조절할 변수 생성
        while(left<=right) {
            answer[cnt++] = (int)Math.max(left/n, left%n)+1;//answer배열에 값을 차례대로 집어넣는다.
            left++;
        }
        return answer;
    }
}
