package Programmers.Level1;

public class Solution39 {
    public String solution(int[] numbers, String hand) {    //키패드 누르기
        String answer = "";
        int left = 10;                      //*버튼을 10, #버튼을 12로 가정
        int right = 12;
        for(int x : numbers){
            if(x == 1||x == 4||x == 7){     //1,4,7을 누를 경우 왼손으로 누르고 왼손위치를 그 키패드위치로 바꿔준다.
                answer += "L";
                left = x;
            }else if(x == 3||x == 6||x == 9){//3,6,9를 누를 경우 오른손으로 누르고 오른손위치를 그 키패드위치로 바꿔준다.
                answer += "R";
                right = x;
            }else{                          //2,5,8,0을 누를 경우
                int ld = length(x,left);    //왼손과 누를 키패드까지의 거리
                int rd = length(x,right);   //오른손과 누를 키패드까지의 거리
                if(ld>rd){                  //왼손이 더 거리가 멀 경우
                    answer += "R";          //오른손으로 키패드를 누른다.
                    right = x;
                }else if(ld < rd){          //오른손이 더 거리가 멀 경우
                    answer += "L";          //왼손으로 키패드를 누른다.
                    left = x;
                }else{                      //왼손과 오른손의 거리가 같을 경우
                    if(hand.equals("left")){//왼손잡이면 왼손으로, 아니면 오른손으로 누른다.
                        answer += "L";
                        left = x;
                    }else{
                        answer += "R";
                        right = x;
                    }
                }
            }
        }
        return answer;
    }
    public int length(int x, int fing){     //왼손이나 오른손과 누를 키패드의 거리를 계산하는 메서드
        x = (x == 0) ? 11 : x;              //0은 숫자 11이라고 생각하고 계산
        fing = (fing == 0) ? 11 : fing;
        return Math.abs(fing-x)%3 + Math.abs(fing-x)/3; //숫자들의 차이/3값과 %3값을 해서 return
    }
}
