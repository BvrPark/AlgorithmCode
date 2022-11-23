package solved.class_2.essential;

import javax.print.attribute.IntegerSyntax;
import java.io.*;
import java.util.*;

//나이 순 정렬(10814번)
public class E9 {

    public static void main(String[] args) throws IOException {

        //입력 변수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //회원의 수 입력
        int n = Integer.parseInt(br.readLine());

        //한번에 출력할 변수 생성
        StringBuilder sb = new StringBuilder();

        //회원의 나이와 이름을 입력할 배열 생성
        String[][] arr = new String[n][2];

        //회원의 나이와 이름을 공백을 기준으로 나눠서 배열에 집어 넣는다.
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().split(" ");
        }

        //Comparator과 Arrays.sort를 이용해서 나이를 오름차순으로 정렬
        Arrays.sort(arr, new Comparator<String[]>(){

            @Override
            public int compare(String[] s1, String[] s2){
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        //오름차순으로 정렬한 것을 sb에 추가 후 출력
        for(int i = 0 ; i<n;i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);

    }
}
