package Programmers.Level1;

import java.util.*;

public class Solution20 {       //크레인 인형뽑기 게임
        public int solution(int[][] board, int[] moves) {
            Stack<Integer> stack = new Stack<>();           //인형을 뽑아서 넣을 곳을 stack으로 만듬
            int answer = 0;
            for(int x : moves){                             //인형 뽑을 배열을 지정
                Loop1 : for(int i = 0; i<board.length;i++){ //인형을 뽑을 라인에서 인형에 닿을 때까지 인형집게를 하나하나 내려감
                    if(board[i][x-1]!=0){                   //인형에 인형집게가 닿으면
                        int tmp = board[i][x-1];            //인형을 인형집게로 집고
                        board[i][x-1] = 0;                  //인형을 뽑은 뒤,
                        //만약 인형을 뽑아서 넣는 곳에 인형이 존재하고, 그 인형과 뽑은 인형이 같을 때,
                        if(!stack.isEmpty() && stack.peek()==tmp){
                            answer += 2;        // 인형을 제거한 숫자를 2개 올린다.
                            stack.pop();        // 그리고 인형집게에 있는 인형과 stack에 존재하는 제일 위의 인형을 제거
                        }else{                  // 인형이 stack에 존재하지 않거나, 뽑은 인형과 존재하는 인형이 다를 경우,
                            stack.push(tmp);    // 인형집게로 뽑은 인형을 stack에 넣는다.
                        }
                        break Loop1;            // 인형집게로 한번 인형을 뽑았으니 break
                    }
                }
            }
            return answer;
        }
}
