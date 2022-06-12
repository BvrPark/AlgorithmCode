package Programmers.Level2;

public class Solution40 {
    public int[] solution(int n) {              //삼각 달팽이
        int[] answer = new int[(n*(n+1))/2];    //삼각형의 갯수만큼 배열 생성
        int[][] matrix = new int[n][n];         //위치에 따라 숫자들을 차례대로 저장할 이차원 배열 생성

        int x = -1, y = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {               //순서대로 아래로 내려갈 때 변하는 좌표값
                    x++;
                } else if (i % 3 == 1) {        //순서대로 오른쪽으로 갈 때 변하는 좌표값
                    y++;
                } else if (i % 3 == 2) {        //순서대로 대각선 위쪽으로 갈 때 변하는 좌표값
                    x--;
                    y--;
                }
                matrix[x][y] = num++;           //정해진 좌표에 순서대로 1부터 (n*(n+1))/2까지 대입한다.
            }
        }

        int k = 0;                              //이차원배열의 값을 순서대로 answer에 옮겨 넣는 작업
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    continue;
                }
                answer[k++] = matrix[i][j];
            }
        }

        return answer;
    }
}
