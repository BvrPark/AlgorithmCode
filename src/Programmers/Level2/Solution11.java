package Programmers.Level2;

import java.util.Stack;

public class Solution11 {
    boolean solution(String s) {        //올바른 괄호
        Stack<Character> stack = new Stack<>(); //Stack선언
        boolean answer = true;

        for(char x : s.toCharArray()){  //String을 하나하나 쪼갠다.
            if(x == '('){               //만약 (일때,
                stack.push(x);          //스택에 쌓고
            }else{                      // (말고 다른 것 일때, 즉, )이 들어올때,
                if(stack.isEmpty()){    //만약 스택에 아무것도 없을 경우
                    return false;       //false를 return
                }
                stack.pop();            //stack에 있는 것 중에 제일 위의 것을 꺼낸다.
            }

        }
        if(!stack.isEmpty()){           //반복문을 다 돌렸을 때, 스택에 뭔가 남아있으면
            answer = false;             //false return
        }
        return answer;
    }
}
