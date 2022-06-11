package Programmers.Level2;

public class Solution38 {           //하노이의 탑 문제
    public static int[][] answer;
    public static int idx;

    public static void hanoi(int n, int first, int mid, int last) { //하노이의 탑 알고리즘
        if (n == 0){
            return;
        }
        hanoi(n - 1, first, last, mid);
        answer[idx][0] = first;
        answer[idx++][1] = last;
        hanoi(n - 1, mid, first, last);
    }

    public static int[][] solution(int n) {
        answer = new int[(int) Math.pow(2, n) - 1][2];
        idx = 0;
        hanoi(n, 1, 2, 3);
        return answer;
    }
}
