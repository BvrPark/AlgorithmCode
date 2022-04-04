package Programmers.Level2;

import java.util.HashSet;
import java.util.Set;

public class Solution23 {
    public int[] solution(int n, String[] words) {      //영어 끝말잇기
        int[] answer = {0,0};
        if(words[0].length() == 1){                     //만약 처음의 단어 길이가 1이면 그대로 return
            answer[0] = 1;
            answer[1] = 1;
            return answer;
        }else {                                         //처음의 단어 길이가 1이 아닐 경우,
            char first;                                 //first에 단어의 첫글자를 넣을 변수를 선언
            char last = words[0].charAt(words[0].length() - 1); //last에 단어의 마지막 글자를 넣고
            Set<String> set = new HashSet<String>();    //중복을 체크할 set을 선언
            set.add(words[0]);                          //set에 첫번째 단어를 넣는다.
            for (int i = 1; i < words.length; i++) {    //두번째 단어부터 check
                set.add(words[i]);                      //set에 단어를 넣고
                first = words[i].charAt(0);             //first에 단어의 첫글자를 넣는다.
                if (last != first || set.size() != i + 1 || words[i].length()==1) { //설명 참고
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }
                last = words[i].charAt(words[i].length() - 1);  //last에 단어의 마지막 글자를 넣는다.
            }
        }
        return answer;
    }
}
