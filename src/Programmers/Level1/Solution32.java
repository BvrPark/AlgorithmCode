package Programmers.Level1;

public class Solution32 {
    public boolean solution(String s) {     //문자열 다루기
        boolean answer = true;
        if(s.length()==4 || s.length()==6){ //문자열 길이가 4 또는 6일때
            for(char x : s.toCharArray()){  //문자열 하나하나를 다 문자배열로 나눈다.
                if(!Character.isDigit(x)){  //만약 숫자가 아닐경우
                    answer = false;         //return false
                }
            }
        }else{                              //문자열의 길이가 4나 6이 아닐경우
            answer = false;                 //return false
        }
        return answer;
    }
}
