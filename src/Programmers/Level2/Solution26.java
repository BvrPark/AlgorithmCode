package Programmers.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution26 {
    public ArrayList<Integer> solution(String s) {       //튜플
        //문자열에서 {,}이 3개를 다 없애고 가운데에 있는 },{대신에 -을 넣는다.
       s = s.substring(2, s.length() - 2).replace("},{", "-");

        String[] arr = s.split("-");                //-을 중심으로 쪼개서 arr배열에 넣는다.
        Arrays.sort(arr, new Comparator<String>() {       // Comparator을 이용해서 arr배열의 길이를 오름차순으로 배열한다.
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        ArrayList<Integer> list = new ArrayList<>();      // 답을 담을 list를 생성성
       for (String temp : arr) {                          // 배열 arr의 요소 하나하나를 ,을 기준으로 나누어서 val배열에 담아준다.
            String[] val = temp.split(",");

            for (int i = 0; i < val.length; i++) {        //val배열의 요소가 String형태이기 때문에 Integer형태로 변형시켜준다.
                int num = Integer.valueOf(val[i]);

                if (!list.contains(num)) {                //그리고 중복을 제거하여 차례대로 list에 추가해준다.
                    list.add(num);
                }
            }
        }
        return list;
    }
}
