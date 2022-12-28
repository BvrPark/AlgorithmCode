package solved.class_2.normal;

import java.io.*;
import java.util.*;

//덩치(7568번)
public class N6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        int count;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            count = 1;
            for (int j = 0; j < N; j++) {
                if((arr[i][0] < arr[j][0]) && (arr[i][1] < arr[j][1])){
                    count++;
                }
            }
            sb.append(count).append(" ");
        }

        System.out.println(sb);


    }
}
