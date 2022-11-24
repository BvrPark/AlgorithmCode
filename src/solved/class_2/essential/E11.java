package solved.class_2.essential;

import java.util.*;
import java.io.*;

//요세푸스 문제 0(11866번)
public class E11 {
    public static void main(String[] args) throws IOException {
        //입력 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n,k입력 받음
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        //사람들을 원모양르로 배열할 Queue세팅
        Queue<Integer> q = new LinkedList<>();
        //답을 모아놓을 곳 세팅
        StringBuilder sb = new StringBuilder();
        
        //q에 사람들 순서대로 넣는다.
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        //sb에 미리 <를 넣어주고 반복문 돌림
        sb.append('<');
        //블로그에 설명 기재
        while (q.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                q.add(q.remove());
            }
            sb.append(q.remove()).append(", ");

        }
        sb.append(q.remove()).append('>');

        System.out.println(sb);
    }
}