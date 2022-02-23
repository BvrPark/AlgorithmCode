package Programmers.Level1;

import java.util.Arrays;
import java.util.Collections;

public class Solution30 {
    public long solution(long n) {          //정수 내림차순으로 배치하기
        long answer = 0;
        String str = "";
        String tmp = Long.toString(n);      //숫자를 String형으로 바꾼다.
        String[] arr = tmp.split(""); //split으로 다 쪼개서 배열에 넣는다.
        Arrays.sort(arr, Collections.reverseOrder());   //내림차순으로 배열 정렬
        for(String s : arr){                //배열을 다시 String형으로 바꾸고
            str += s;
        }
        answer = Long.parseLong(str);       //String형에서 Long형으로 다시 변환
        return answer;
    }
}
