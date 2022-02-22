package Programmers.Level1;

public class Solution26 {           //핸드폰 번호 가리기
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0;i<phone_number.length();i++){     //핸드폰 번호 길이만큼 반복
            if(i<phone_number.length()-4){              //뒷자리 4개가 아닐때는 *대입
                answer += "*";
            }else{                                      //뒷자리 4개 일때는
                answer += phone_number.charAt(i);       //원래 번호 대입
            }
        }
        return answer;
    }
}
