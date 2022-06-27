package Programmers;

import java.util.*;

public class TestCase {
    public ArrayList<String> solution(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<>();   //정답을 담을 배열 생성
        Map<String,Integer> check = new HashMap<>();    //빈도수 체크할 Map생성
        for(String s : orders){
            char[] ch_arr = s.toCharArray();
            Arrays.sort(ch_arr);
            s = String.valueOf(ch_arr);

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
