package Programmers.Level1;

public class Solution34 {
    public String solution(int a, int b) {      //2016년
        String answer = "";
        int num = 0;
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31}; //달들의 날짜를 담음
        String[] arr = {"THU","FRI","SAT","SUN","MON","TUE","WED"}; //요일들을 담음
        for(int i = 0; i<a-1;i++){
            num += date[i];         //달을 입력했을 때 그 전달까지의 모든 날들을 더함
        }
        num += b;                   //날짜를 입력했을 때 그 날짜까지 더함
        answer = arr[num%7];        //총 더한 일수에서 7을 나눈 나머지가 배열의 index값이 됨
        return answer;
    }
}
