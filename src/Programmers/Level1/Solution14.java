package Programmers.Level1;

import java.util.Arrays;

public class Solution14 {                       //예산문제
    public int solution(int[] d, int budget){
        int answer = 0;                         //신청가능한 부서의 종류
        int sum = 0;                            //총 드는 예산의 합
        Arrays.sort(d);                         //우선 신청금액들을 오름차순으로 정렬
        Loop1: for(int i = 0;i<d.length;i++){
            sum += d[i];                        //신청금액들을 작은 것부터 차례대로 더하고
            if(sum>budget){                     //만약 금액의 합이 총 예산보다 크면
                break Loop1;                    //신청 가능한 부서의 종류의 수를 올리지 않고 break
            }else{                              //금액의 합이 총 예산보다 작으면
                answer++;                       //신청 가능한 부서의 종류의 수를 1증가
            }
        }
        return answer;
    }
}
