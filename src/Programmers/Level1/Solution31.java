package Programmers.Level1;

public class Solution31 {
    public String solution(String s, int n) {       //시저암호
        String answer = "";
        for(char ch : s.toCharArray()){             //문자열 하나하나를 문자배열로 바꿔서 받음
            if(Character.isLowerCase(ch)) {         //문자가 소문자일 경우
                ch = (char) ((ch - 'a' + n) % 26 + 'a');    //소문자에서 'a'를 빼고 n만큼 더한 후, 'z'를 넘어가는 경우를 대비해서 %26을 해준다.
            } else if(Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');    //소문자와 마찬가지 패턴으로 대문자를 판별해준다.
            }
            answer += ch;   
        }
        return answer;
    }
}
