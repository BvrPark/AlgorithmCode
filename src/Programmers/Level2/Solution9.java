package Programmers.Level2;

public class Solution9 {
    public int solution(int n) {                //다음 큰 숫자
        int count = 0;
        int match = 0;
        int num = n;
        String str = Integer.toBinaryString(n); //이진수로 변경
        for(char x : str.toCharArray()){        //1이 들어간 갯수를 count
            if(x == '1'){
                count++;
            }
        }
        Loop1:
        while(true){
            match = 0;
            num++;                              //n의 다음수부터 대입
            String str2 = Integer.toBinaryString(num);  //이진수로 변경
            for(char z : str2.toCharArray()){   //1이 들어간 횟수를 count
                if(z == '1'){
                    match++;
                }
            }
            if(match == count){                 //match와 count의 갯수가 같으면 while문 break
                break Loop1;
            }
        }
        return num;                             //그때의 num값 반환
    }
}
