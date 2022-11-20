package Programmers.Level2;

import java.util.ArrayList;
import java.util.List;

// 우박수열 정적분
public class S47 {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];    //답 저장할 배열
        List<Double> area = new ArrayList<>();          //구간 별 누적 넓이를 저장할 List
        int prev = k;
        area.add(0.0);
        while(k != 1){
            if(k%2 == 0){
                k /= 2;
            }else{
                k = k*3 + 1;
            }
        }
        return answer;
    }


}
