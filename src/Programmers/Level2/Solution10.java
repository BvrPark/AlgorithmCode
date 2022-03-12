package Programmers.Level2;

public class Solution10 {
    public String solution(int n) {     //124나라의 숫자
        String answer = "";
        while(n>0){
            if(n%3 == 1){               //나머지가 1일때,
                n = n/3;                //n값을 3으로 나눠주고
                answer = "1" + answer;  //answer에 1을 더함
            }else if(n%3 == 2){         //나머지가 2일때,
                n = n/3;
                answer = "2" + answer;
            }else if(n%3 == 0){         //나머지가 0일때,
                answer = "4" + answer;  //answer에 4를 더하고
                n = n/3;                //n값을 3으로 나눠준 뒤
                n--;                    //n값에 1을 뺀다.
            }
        }
        return answer;
    }
}
