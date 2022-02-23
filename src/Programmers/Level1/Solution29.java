package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution29 {
    public ArrayList<Integer> solution(int[] arr) {     //제일 작은 수 제거하기
        ArrayList<Integer> answer = new ArrayList<>();  //답을 담을 리스트 생성
        int[] tmp = arr.clone();                        //배열을 복사
        Arrays.sort(tmp);                               //오름차순으로 정렬 후
        int min = tmp[0];                               //제일 작은 수를 따로 min으로 지정
        for (int x : arr) {
            if (arr.length == 1) {                      //만약 배열의 크기가 1이면 -1을 반환
                answer.add(-1);
            } else {                                    //배열의 크기가 1이상이면 제일 작은 수 빼고 다 반환
                if (x == min) {
                    continue;
                } else {
                    answer.add(x);
                }
            }
        }
        return answer;
    }
}
