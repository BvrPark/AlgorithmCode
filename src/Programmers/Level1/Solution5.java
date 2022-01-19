package Programmers.Level1;

public class Solution5 {
    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr1[0].length];  //arr1의 2차원배열 길이만큼 answer배열을 지정
            for(int i = 0; i<arr1.length;i++){                      //이중 for문을 사용해서
                for(int j = 0; j<arr1[0].length;j++){               //행렬의 덧셈을 진행함
                    answer[i][j] = arr1[i][j]+arr2[i][j];
                }
            }
            return answer;
        }
    }
}
