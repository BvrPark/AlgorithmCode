package Programmers.Level1;

public class Solution17 {
    public int solution(int[][] sizes) {            //최소 직사각형 문제
        int answer = 0;
        int Max_f = 0;
        int Max_b = 0;
        sort(sizes);
        for(int i = 0; i<sizes.length; i++){
            Max_f = Math.max(Max_f,sizes[i][0]);    //이차원배열에서 앞(index = 0)끼리 비교해서 큰것
            Max_b = Math.max(Max_b,sizes[i][1]);    //이차원배열에서 뒤(index = 1)끼리 비교해서 큰것
        }
        answer = Max_f * Max_b;
        return answer;
    }

    public int[][] sort(int[][] arr){               //이차원 배열의 앞,뒤를 정렬시키는 메서드
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i][0] > arr[i][1]){
                temp = arr[i][0];
                arr[i][0] = arr[i][1];
                arr[i][1] = temp;
            }
        }
        return arr;
    }
}
