package solved.class_2.normal;

import java.util.*;
import java.io.*;

//분해합(2231번)
public class N2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 1 ~ 1,000,000
        int M = 1;
        int num;
        int sum;
        int p = 0;

        if (N > 100) {
            M = N - 100;
        }

        for (int i = M; i < N; i++) {
            sum = 0;
            num = i;

            while(num != 0){
                sum += num%10;
                num /= 10;
            }
            if(sum + i == N){
                p = i;
                break;
            }
        }
        System.out.println(p);

    }
}
