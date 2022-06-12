package Programmers.Level2;

import java.util.ArrayList;
import java.util.List;

public class Solution39 {
    public int[] solution(int n, long k) {      //줄 서는 방법
        int[] answer = new int[n];
        int idx = 0;                            //index값
        long fac = 1;                           //factorial
        List<Integer> list = new ArrayList<>();
        k--;                                    //k값에서 1을 빼준다 자세한 풀이는 블로그에 기재
        for (int i = 1; i <= n; i++) {          //ArrayList에 1~n까지 차례대로 추가해주고 factorial에 곱해줌
            list.add(i);
            fac *= i;
        }
        while(n>0){                             //자세한 풀이는 블로그에 기재
            fac /= n;
            answer[idx++] = list.get((int)(k/(fac)));
            list.remove((int)(k/fac));
            k %= fac;
            n--;
        }
        return answer;
    }

}
