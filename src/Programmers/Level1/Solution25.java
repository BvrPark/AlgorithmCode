package Programmers.Level1;

import java.util.ArrayList;

public class Solution25 {                           //자연수 뒤집어 배열로 만들기
    public ArrayList<Long> solution(long n) {
        ArrayList<Long> answer = new ArrayList<>(); //답을 담을 ArrayList생성
        while(n!=0){            //자연수가 0이 될때까지 반복
            answer.add(n%10);   //10으로 나눈 나머지, 즉 자연수에서 제일 끝자리부터 answer에 추가
            n/=10;              //그후 n값을 10으로 나눈 정수로 설정
        }
        return answer;
    }
}
