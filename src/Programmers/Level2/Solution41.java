package Programmers.Level2;

public class Solution41 {
    public String solution(String number, int k) {                  //큰 수 만들기
        StringBuilder answer = new StringBuilder();                 // 실행속도 때문에 StringBuilder를 따로 만듬
        int len = number.length() - k;                              // 만들 수 있는 숫자의 길이
        int start = 0;                                              // 시작지점

        while(start < number.length() && answer.length() != len) {  // 자세한 풀이는 블로그에 기재
            int leftNum = k + answer.length() + 1;
            int max = 0;
            for (int j = start; j < leftNum; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    start = j + 1;
                }
            }
            answer.append(Integer.toString(max));
        }
        return answer.toString();
    }
}
