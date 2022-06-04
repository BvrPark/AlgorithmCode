package Programmers.Level2;

import java.util.HashMap;
import java.util.Map;

public class Solution34 {
    public boolean solution(String[] phone_book) {              //전화번호 목록 문제
        String clone;
        Map<String, Integer> phones = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            phones.put(phone_book[i], i);
        }
        for (int i = 0; i < phone_book.length; i++) {
            clone = phone_book[i];
            for (int j = 1; j < clone.length(); j++) {
                if(phones.containsKey(clone.substring(0,j))){
                    return false;
                }
            }
        }
        return true;
    }
}
