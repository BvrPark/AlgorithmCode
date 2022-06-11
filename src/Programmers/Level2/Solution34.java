package Programmers.Level2;

import java.util.HashMap;
import java.util.Map;

public class Solution34 {
    public boolean solution(String[] phone_book) {              //전화번호 목록 문제
        String clone;
        Map<String, Integer> phones = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {           //전화번호들을 HashMap형태로 대입
            phones.put(phone_book[i], i);
        }
        for (int i = 0; i < phone_book.length; i++) {
            clone = phone_book[i];                              //전화번호 1개를 clone에 넣음
            for (int j = 1; j < clone.length(); j++) {          //그 전화번호의 처음부터 끝까지 잘랐을때
                if(phones.containsKey(clone.substring(0,j))){   //그 전화번호의 접두에 다른 전화번호가 있을 경우
                    return false;                               //false반환
                }
            }
        }
        return true;                                            //걸리는 것이 없으면 true반환
    }
}
