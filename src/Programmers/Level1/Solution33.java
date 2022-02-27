package Programmers.Level1;

import java.util.ArrayList;

public class Solution33 {                               //같은 숫자는 싫어
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int tmp = 0;                                    //비교할 숫자 tmp생성
        answer.add(arr[0]);                             //우선 배열의 첫번째를 추가
        for(int i = 1; i<arr.length;i++){               //비교할 숫자에 그 다음 배열의 값을 넣고
            tmp = arr[i];
            if(arr[i-1] != arr[i]){                     //그 전 배열의 값과 그 다음 배열의 값이 다르면
                answer.add(tmp);                        //그때, 그 다음 배열의 값을 답에 추가
            }
        }
        return answer;
    }
}
