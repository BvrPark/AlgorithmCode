package solved.class_2.essential;

import java.io.*;
import java.util.*;

//수 정렬하기(2751번)
public class E8 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //Scanner 대신 BufferedReader로 썼다.
        StringBuilder sb = new StringBuilder();     //String대신 String Builder을 사용
        int n = Integer.parseInt(br.readLine());    //br.readLine()은 문자열로 입력되므로 parseInt를 사용
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

       Collections.sort(list);                      //시간이 오래 걸리는 Arrays.sort대신 Collections.sort사용

        for (int i : list) {
            sb.append(i).append("\n");              //sb에 한번에 저장한 뒤, 출력
        }
        System.out.println(sb);
    }
}
