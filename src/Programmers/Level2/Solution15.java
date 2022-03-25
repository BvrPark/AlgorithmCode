package Programmers.Level2;

import java.util.PriorityQueue;

public class Solution15 {
    public int solution(int[] scoville, int K) {        //더 맵게
        int answer = 0;
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for(int x : scoville){                      //스코빌 지수를 list에 새로 대입
            list.add(x);
        }
        while(list.size()>0){                       //list의 갯수가 1개 이하로 떨어질 때까지 반복
            if(list.peek()>=K){                     //list에서 제일 작은 값이 K이상일 때, 반복문 탈출
                break;
            }else{                                  //list에서 제일 작은 값이 K보다 작을 때,
                if(list.size()==1){                 //만약 list의 크기가 1이면 끝까지 섞었는데도 답이 안나온 것이므로 -1반환환
                    return -1;
                }
                int s1 = list.remove();             //제일 작은 값을 list에서 제거하고 s1에 저장
                int s2 = list.remove();             //두번째로 작은 값을 list에서 제거하고 s2에 저장
                int mix = s1 + s2*2;                //s1,s2를 정해진 법칙에 따라서 섞음
                list.add(mix);                      //섞은 값을 다시 list에 대입
                answer++;                           //섞은 횟수 추가
            }
        }

        return answer;
    }
}
