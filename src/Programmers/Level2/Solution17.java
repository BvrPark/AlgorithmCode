package Programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution17 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {   //다리를 지나는 트럭
        int answer = 0;
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();              //다리길이 만큼을 큐라고 생각
        for (int i = 0; i < truck_weights.length; i++) {    //truck무게 각각을 변수 truck에 지정해서 반복문 돌림
            int truck = truck_weights[i];
            while (true) {
                if (q.isEmpty()) {                       //다리(큐)에 아무것도 없을 경우
                    q.add(truck);                        //다리(큐)에 트럭을 올린다.
                    sum += truck;                        //그리고 무게하중에 트럭의 무게만큼 더한다.
                    answer++;                            //시간초를 센다
                    break;
                } else if (q.size()==bridge_length){     //다리(큐)에 트럭이 꽉 차있을 경우
                    sum -= q.remove();                   //무게하중에 트럭의 무게 1개를 빼고, 다리에서 제일 앞의 트럭을 밖으로 빼준다.
                }else{                                   //다리(큐)에 트럭이 있지만 꽉 차있지는 않을 경우,
                    if((truck + sum) > weight){          //현재 다리에 있는 트럭들의 무게의 합과, 새로운 트럭의 무게의 합이 견딜 수 있는 무게를 넘을 경우
                        q.add(0);                        //임의로 무게가 0인 트럭을 다리에 올린다고 생각
                        answer++;                        //시간초를 센다.
                    }else{                               //현재 다리에 있는 트럭들의 무게의 합과, 새로운 트럭의 무게의 합이 견딜 수 있는 무게에 못 미칠 경우
                        q.add(truck);                    //새로운 트럭을 다리에 올리고, 다리에 있는 트럭들의 무게의 합에 더한다.
                        sum += truck;
                        answer++;                        //시간 초를 센다.
                        break;
                    }
                }
            }
        }
        return answer+bridge_length;                     //마지막 트럭이 다리에 들어설 때, 반복문이 종료되므로 다리길이만큼 초를 추가
    }
}
