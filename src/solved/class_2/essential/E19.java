package solved.class_2.essential;

import java.util.*;
import java.io.*;

//체스판 다시 칠하기(1018번)
public class E19 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = Integer.MAX_VALUE;
        int count = 0;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] chess = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                if (s.charAt(j) == 'B') {
                    chess[i][j] = true;
                }

            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                boolean prime = chess[i][j];
                count = 0;
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if(chess[k][l] != prime){
                            count++;
                        }

                        prime = !prime;
                    }
                    prime = !prime;
                }
                count = Math.min(count, 64 - count);
                min = Math.min(min,count);
            }
        }
        System.out.println(min);
    }
}
