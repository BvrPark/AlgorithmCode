package Programmers.Level2;

public class Solution6 {
    public String solution(String s) {      //최댓값과 최솟값 문제
        String[] arr = s.split(" ");  //문자열을 다 나눔
        int max = Integer.MIN_VALUE;        //최댓값 설정
        int min = Integer.MAX_VALUE;        //최솟값 설정

        for(String x : arr){
            int i = Integer.parseInt(x);    //int형으로 바꿔줌
            if(i >= max){   //max값 보다 크면 최댓값
                max = i;
            }else if(min >= i){ //min값 보다 크면 최솟값
                min = i;
            }
        }
        return min+" "+max;
    }
}
