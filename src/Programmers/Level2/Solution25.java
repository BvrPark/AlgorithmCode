package Programmers.Level2;

import java.util.Stack;

public class Solution25 {
    public int solution(String s){      //짝지어 제거하기
        Stack<Character> ch = new Stack<>();    //짝을 판별할 스택을 생성
        for(char x : s.toCharArray()){
            if(!ch.isEmpty() && ch.peek()== x){ //스택이 비어있지 않고, 같은 문자일 경우
                ch.pop();                       //같은 문자를 제거
            }else{                              //같은 문자가 아닐경우
                ch.push(x);                     //문자를 스택에 넣음
            }
        }
        return ch.isEmpty()? 1:0;               //스택이 비어있으면 1을 반환 아니면 0을 반환
    }
}
