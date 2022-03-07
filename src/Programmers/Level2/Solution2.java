package Programmers.Level2;

public class Solution2 {
    public String solution(String s) {              //JadenCase 문자열 만들기
        String answer = "";
        boolean change = true;                      //true일경우 대문자로 바꾸는 변수 생성
        for(char x : s.toCharArray()){
            if(change){                             //change = "true"일 경우
                answer += Character.toUpperCase(x); //대문자로 바꾸고
                change = false;                     //change = "false"로 바꾼다.
            }else{                                  //chage = "false"일 경우
                answer += Character.toLowerCase(x); //소문자로 바꾼다.
            }
            if(x == ' '){                           //그리고 만약 이렇게 바꾼 뒤 그것이 공백이라면
                change = true;                      //change를 다시 "true"로 바꾼다.
            }
        }
        return answer;
    }
}
