package Programmers.Level_1;

public class Lotto {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = {0,0};               //최종 결과물

            int count = 0;                      //0의 갯수
            int match = 0;                      //로또 번호와 서로 맞는 갯수
            for(int i : lottos) {               //로또 번호를 고른 용지에서
                if(i == 0) {                    //0이 있을 때마다
                    count++;                    //count 1개 증가
                }
                for(int j : win_nums) {         //로또 당첨번호를 하나하나 고른 용지와 비교를 한다.
                    if(i == j) {                //만약 로또 당첨번호가 고른 용지에 있으면
                        match++;                //서로 맞는 갯수인 match를 1증가시킨다.
                    }
                }
            }
            answer[0] = rank(count+match);  //제일 많이 맞았을 떄는 알수없는 값인 0이 다 로또 당첨번호일때 이므로 이렇게
            answer[1] = rank(match);           //제일 적게 맞았을 때는 알수없는 값인 0이 다 당첨이 아니므로 이렇게

            return answer;
        }
        public int rank(int n) {            //로또 번호를 맞춘 갯수에 따라 등수를 return해주는 switch-case문 작성
            switch(n) {
                case 6 :
                    return 1;
                case 5 :
                    return 2;
                case 4 :
                    return 3;
                case 3 :
                    return 4;
                case 2 :
                    return 5;
                default :
                    return 6;
            }
        }
    }
}
