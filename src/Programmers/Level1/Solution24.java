package Programmers.Level1;

public class Solution24 {               //이상한 문자 만들기
    public String solution(String s) {
        String answer = "";
        int count = 0;
        for (char x : s.toCharArray()) {    //char형 배열로 입력된 문자열 다 쪼개기
            if (x == ' ') {                 //공백일 경우 count 리셋함
                count = 0;
                answer += x;
            }else {                         //공백이 아닐 경우 count가 짝수일 경우 대문자, 홀수일 경우 소문자로 바꿔서 return
                answer+= (count % 2 == 0 ? Character.toUpperCase(x) : Character.toLowerCase(x));
                count++;                    //count 증가
            }
        }
        return answer;
    }
}
