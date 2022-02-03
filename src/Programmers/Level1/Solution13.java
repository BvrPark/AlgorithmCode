package Programmers.Level1;

public class Solution13 {
    public int solution(int n){         //3진법 뒤집기 문제
        int answer = 0;
        String str = "";
        str = new StringBuilder(jin(n)).reverse().toString(); //3진법으로 바꾼 수를 뒤집어서 str에 넣음
        answer = Integer.parseInt(str,3);               //3진법으로 뒤집은 수를 십진수로 다시 고침
        return answer;
    }
    public String jin(int n){           //10진법의 수를 받아서 3진법으로 바꾸는 메서드
        String str = "";
        while(n>0){
            str = n%3 + str;
            n = n/3;
        }
        return str;
    }
}
