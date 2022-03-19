package Programmers.Level2;

import java.util.*;

public class Solution13 {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {        //기능개발 문제
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 1;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i< progresses.length;i++){   //개발 완료까지 걸리는 일수를 계산
            q.add((int) Math.ceil((double)(100 - progresses[i]) / speeds[i]));
        }
        int m = q.poll();                           //제일 앞의 값을 기준 값으로 정한다.
        for(int i = 1; i < progresses.length;i++){  
            int x = q.poll();                       //기준 값을 제외한 제일 앞의 값을 x에 대입
            if(m<x){                                //기준값과 x의 값을 비교해서 x값이 더 크면
                answer.add(count);                  //answer에 그때의 count값을 추가하고
                count = 1;                          //count를 1로 바꾼다.
                m = x;                              //그리고 기준값을 x로 바꾼다.
            }else{
                count++;                            //count 1증가
            }
        }
        answer.add(count);

        return answer;
    }
}
