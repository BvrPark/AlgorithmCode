package Programmers.Level2;

import java.util.*;

public class Solution29 {
    public int solution(String[][] clothes) {      //위장
        int answer = 1;
        Map<String, Integer> m = new HashMap<>();   //부위별로 옷의 갯수를 저장할 HashMap을 생성
        for (int i = 0; i < clothes.length; i++) {  //부위별로 옷의 갯수를 HashMap에 저장
            m.put(clothes[i][1],m.getOrDefault(clothes[i][1],0)+1);
        }
        for(String x : m.keySet()){ //부위별로 옷의 갯수 +1을 한 값을 다 곱한다.
            answer *= m.get(x)+1;
        }
        return answer-1;            //답에서 1을 뺸다.
    }
}
