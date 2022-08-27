package Programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution46 {
    public int solution(int[] queue1, int[] queue2) {   //두 큐의 합 같게 만들기
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();         //각각의 배열을 담을 큐를 생성
        Queue<Integer> q2 = new LinkedList<>();
        long sum1 = 0, sum2 = 0;                        //각각의 배열의 합을 담을 sum생성
        for (int i = 0; i < queue1.length; i++) {       //각 배열의 합을 sum에, 그리고 각 배열을 큐에 넣는다.
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        if ((sum1 + sum2) % 2 != 0) {   //만약 모든 배열의 합이 홀수일때, 두 큐의 합은 절대 같지 않으므로 -1 return
            return -1;
        }
        while (sum1 != sum2) {          //두 큐의 합이 같을 때, 반복문 탈출
            answer++;
            if(sum1 > sum2){            //sum1이 더 클때,
                int i = q1.remove();
                sum1 -= i;
                sum2 += i;
                q2.add(i);
            }else{                      //sum2가 더 클때,(반복문 조건에서 두 큐의 합이 같을 때는 제외됨)
                int i = q2.remove();
                sum1 += i;
                sum2 -= i;
                q1.add(i);
            }

            if(answer > queue1.length*4){   //만약 반복문이 끝나지 않고 계속 커졌을 때 -1 return
                return -1;
            }
        }
        return answer;
    }
}
