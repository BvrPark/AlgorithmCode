package Programmers.Level2;

public class Solution32 {
    public int[] solution(String s) {                       //이진 변환 반복하기
        int[] answer = new int[2];
        String s2 = "";
        while(true){
            if(s.equals("1")){                              //만약 s가 1일경우 반복문 종료
                break;
            }
            answer[0]++;                                    // 변환 횟수에 +1
            s2 = s.replace("0","");         // 0을 제거
            answer[1] += s.length()-s2.length();            // 원래의 수의 길이에서 0을 제거한 수의길이만큼 0의 제거횟수에 +
            s = Integer.toBinaryString(s2.length());        // s를 이진수로 바꿔준다.
        }
        return answer;
    }
}
