package Programmers.Level2;

import java.util.ArrayList;
import java.util.List;

// 우박수열 정적분
public class S47 {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];    //답 저장할 배열
        List<Double> area = new ArrayList<>();          //구간 별 누적 넓이를 저장할 List
        int prev = k;
        int count = 0;
        area.add(0.0);
        while(k != 1){
            if(k%2 == 0){
                k /= 2;
            }else{
                k = k*3 + 1;
            }
            area.add(area.get(count) + (prev+k)/2.0);
            prev = k;
            count++;
        }

        for(int i = 0; i < answer.length; i++){
            answer[i] = area.get(count+ranges[i][1]) - area.get(ranges[i][0]);
            if(answer[i] < 0){
                answer[i] = -1;
            }
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        S47 test = new S47();
        int[][] arr = {{0,0},{0,-1},{2,-3},{3,-3}};
        System.out.println(test.solution(5,arr));
    }
}

