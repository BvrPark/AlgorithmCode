package Programmers.Level2;

import java.util.Arrays;

public class Solution5 {
    public int solution(int[] A, int[] B){      //최솟값 만들기
        int answer = 0;
        int leng = A.length-1;              //배열의 index값으로 설정할 leng생성
        Arrays.sort(A);                     //배열을 둘 다 정렬해준다.
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++){  //A배열의 최솟값과 B배열의 최댓값을 매칭시켜서 각각 곱해서 더해준다.
            answer += A[i]*B[leng--];
        }
        return answer;
    }
}
