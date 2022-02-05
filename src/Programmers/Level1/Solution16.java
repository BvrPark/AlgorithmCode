package Programmers.Level1;

import java.util.*;

public class Solution16 {                                   //모의고사
    public ArrayList<Integer> solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};                     //1번 수포자 답
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};            //2번 수포자 답
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};      //3번 수포자 답
        int a1 = 0, a2 = 0, a3 = 0;                     //각 수포자들의 답이 맞는 갯수

        for (int i = 0; i < answers.length; i++) {      //각 수포자들의 답이 맞으면 a1,a2,a3들의 갯수를 증가
            if(p1[i % p1.length] == answers[i]){
                a1++;
            }
            if(p2[i%p2.length] == answers[i]){
                a2++;
            }
            if(p3[i%p3.length] == answers[i]){
                a3++;
            }
        }
        int max = Math.max(a1,Math.max(a2,a3));         // 답을 많이 맞춘 갯수를 max로 잡고
        ArrayList<Integer> answer = new ArrayList<>();  // 이 문제에서 요구하는 답
        if(max == a1){              //최대로 맞춘 갯수와 a1의 갯수가 같으면 답에 1을 추가해줌
            answer.add(1);
        }
        if(max == a2){              //마찬가지로 2추가
            answer.add(2);
        }
        if(max == a3){              //마찬가지로 3추가
            answer.add(3);
        }
        return answer;
    }
}
