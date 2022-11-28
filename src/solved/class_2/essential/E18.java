package solved.class_2.essential;

import java.util.*;
import java.io.*;

//숫자 카드 2(10816번)
public class E18 {

    public static void main(String[] args) throws IOException {
        //입력 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력 세팅
        StringBuilder sb = new StringBuilder();
        //중복을 체크할 HashMap생성
        Map<Integer, Integer> map = new HashMap<>();

        //N 입력
        int n = Integer.parseInt(br.readLine());
        //숫자들을 HashMap에 넣는다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());
            //HashMap에 대입할 때, getOrDefault를 사용하여 이미 있는 숫자면 그 숫자의 value에 +1을
            //없는 숫자면 value에 1을 넣어준다.
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        //M 입력
        int m = Integer.parseInt(br.readLine());
        //숫자들을 HashMap과 비교하여 체크한다.
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            //숫자들이 HashMap에 존재할 경우 그 value를 반환하고, 없을 경우 0을 반환
            sb.append(map.getOrDefault(key,0)).append(' ');
        }
        //출력
        System.out.println(sb);
    }
}
