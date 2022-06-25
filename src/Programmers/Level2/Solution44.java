package Programmers.Level2;

public class Solution44 {
    public int[] solution(long begin, long end) {           //숫자 블록
        int[] answer = new int[(int) (end - begin + 1)];

        for (int i = (int)begin; i <= end; i++) {
            answer[i - (int)begin] = find(i);
        }
        return answer;
    }

    public int find(int n) {                                //최대 약수를 찾는 메서드
        if (n == 1) {
            return 0;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0 && n/i <= 10000000){
                    return n/i;
                }
            }
        }
        return 1;
    }
}
