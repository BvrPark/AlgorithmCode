package Programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution12 {                       //프린터 문제
    class Printer{                              //프린터의 index위치와 중요도를 담은 class Printer생성
        int lo;
        int priority;
        public Printer(int lo, int priority){
            this.lo = lo;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Printer> q = new LinkedList<>();  //프린터의 정보를 담을 큐 생성
        for(int i = 0; i < priorities.length; i++){ //큐에 프린터의 정보들을 추가
            q.add(new Printer(i,priorities[i]));
        }

        while(!q.isEmpty()){                    //큐에 값이 남아있을경우
            Printer p = q.poll();               //p에 큐에서 제일 앞의 값을 빼내서 저장
            for(Printer x : q){
                if(x.priority > p.priority){    //p의 중요도보다 남아있는 큐의 중요도가 더 클 경우,
                    q.add(p);                   //p를 다시 큐에 추가하고
                    p = null;                   //p를 null로 만든 뒤,
                    break;                      //반복문 탈출
                }
            }
            if(p != null) {                     //만약 p가 null이 아닐 경우(p의 중요도가 제일 클 경우)
                answer++;                       //인쇄횟수 1증가
                if (p.lo == location) {         //만약 p의 위치가 우리가 찾는 위치일 경우
                    return answer;              //그때의 인쇄 횟수를 return
                }
            }

        }
        return answer;
    }
}
