package Programmers.Level2;

public class Solution14 {
    public int[] solution(int[] prices) {           //주식가격
        int[] answer = new int[prices.length];
        int count = 0;                              //주식이 떨어지는 시간 count
        for(int i = 0; i< prices.length;i++){
            count = 0;
            for(int j = i+1; j< prices.length;j++){
                count++;
                if(prices[i]>prices[j]){            //만약 앞의 값이 더 크면 반복문 탈출
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
