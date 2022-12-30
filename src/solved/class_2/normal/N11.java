package solved.class_2.normal;

import java.io.*;
import java.util.*;

//소수 구하기(1929번)
public class N11 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] b;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        b = new boolean[N + 1];
        b[1] = true;

        for (int i = 2; i <= N; i++) {
            if (!b[i]) {
                for (int j = i+i; j <= N; j += i){
                    b[j] = true;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (!b[i]) {
                sb.append(i).append("\n");
            }

        }
        System.out.println(sb);
    }
}
