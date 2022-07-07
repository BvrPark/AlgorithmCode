package Programmers;

import java.util.*;

public class TestCase {
    public ArrayList<String> solution(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<>();   //정답을 담을 배열 생성
        Map<String,Integer> check = new HashMap<>();    //빈도수 체크할 Map생성
        for(String s : orders){
            char[] ch_arr = s.toCharArray();            //문자열을 문자배열로 바꿈
            Arrays.sort(ch_arr);                        //문자배열들을 오름차순으로 정렬
            s = String.valueOf(ch_arr);                 //다시 문자열로 만들어줌
        }
        return answer;
    }



    public static void main(String[] args) {
        TestCase test = new TestCase();
        String[] arr = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
