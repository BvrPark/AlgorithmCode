package Programmers.Level2;

public class Solution30 {
    public int solution(String word) {  //모음사전
        int answer = 0;
        int total= 3905;    //총 나올수 있는 경우의 수
        String tmp="AEIOU"; //알파벳 모음의 순서

        for(String str: word.split("")){
            //첫째, 둘째, 셋째, 넷째, 다섯번째자리에 모음이 바뀔 때마다 올라가는 숫자
            //781, 156, 31, 6, 1
            total/= 5;  //모음이 5개이므로 경우의 수에서 5로 나누어줌
            answer+= total*tmp.indexOf(str)+1;  //경우의 수를 계산
        }

        return answer;
    }
}
