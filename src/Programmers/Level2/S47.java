package Programmers.Level2;

// 우박수열 정적분
public class S47 {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];    //답 저장할 배열
        long[][] matrix = new long[ranges.length][2];   //좌표를 저장할 배열
        long[] area = new long[ranges.length];          //구간 별 누적 넓이를 저장할 배열
        int num = 0;
        while(matrix[num][2] != 1){
            matrix[num][1] = k;
            if(k){

            }
        }
        return answer;
    }


}
