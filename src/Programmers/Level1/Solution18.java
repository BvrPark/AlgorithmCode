package Programmers.Level1;
import java.util.*;
public class Solution18 {
    public String[] solution(String[] strings, int n) {     //문자열 내 마음대로 정렬하기
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i< strings.length;i++){              //문자열에서 정렬 기준으로 할 문자를 문자열의 제일 앞에 붙여서 list에 추가
            list.add(strings[i].charAt(n)+strings[i]);
        }

        Collections.sort(list);                             //list 정렬

        String[] answer = new String[strings.length];          //답의 배열 크기를 지정해줌
        for(int i = 0; i< strings.length;i++){
            answer[i] = list.get(i).substring(1);              //정렬 기준으로 한 제일 앞문자를 제외한 나머지 문자열을 answer에 대입
        }

        return answer;
    }

}
