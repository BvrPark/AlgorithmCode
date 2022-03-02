package Programmers.Level1;
import java.util.*;
public class Solution37 {
    public int[] solution(int N, int[] stages) {    //실패율
        Map<Integer,Double> map = new HashMap<>();  //실패율을 저장할 map
        int[] answer = new int[N];
        int[] pass = new int[N+1];                  //통과한 사람의 수
        int[] num = new int[N+2];                   //스테이지에 머무르는 사람의 수

        for(int i = 0;i<stages.length;i++){         //스테이지에 머무르는 사람과 통과한 사람을 체크
            if(stages[i]<N+1){
                num[stages[i]]++;
            }
            for(int j = 0;j<stages[i];j++){
                if(j<N){
                    pass[j+1]++;
                }
            }
        }
        for(int k = 1;k<=N;k++){
            if(pass[k]!=0){
                map.put(k,(double)num[k]/pass[k]);  //실패율을 저장
            }else{
                map.put(k,0.0);
            }
        }
        for(int l = 0;l<N;l++){                     //value값을 내림차순에 따라 정리
            double max = -1;
            int key = 0;
            for(Integer x : map.keySet()){
                if(max<map.get(x)){
                    max = map.get(x);
                    key = x;
                }
            }
            answer[l] = key;
            map.remove(key);
        }
        return answer;
    }
}
