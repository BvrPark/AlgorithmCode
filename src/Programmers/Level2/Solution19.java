package Programmers.Level2;

import java.util.*;

public class Solution19 {
    public int solution(int[] citations) {          //H-index
        int answer = 0;
        Arrays.sort(citations);                     //주어진 논문을 오름차순으로 정렬

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;           //논문의 길이에서 1씩 감소시킨 값을 h에 반복해서 다시 저장

            if (citations[i] >= h) {                //논문의 인용수가 h보다 크거나 같을 때
                answer = h;                         //그때의 h값을 answer에 저장하고 break
                break;
            }
        }
        return answer;
    }
}
