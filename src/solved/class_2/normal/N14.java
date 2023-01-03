package solved.class_2.normal;

import java.util.*;
import java.io.*;

//랜선 자르기(1654번)
public class N14 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum;
        long start = 0;
        long end = 0;
        long mid;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());   //가지고 있는 랜선 갯수
        int N = Integer.parseInt(st.nextToken());   //만들 랜선 갯수

        int[] arr = new int[K];

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > end) {
                end = arr[i];
            }
        }

        end++;

        while (start < end) {
            mid = (start + end) / 2;
            sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i] / mid;
            }
            if (sum < N) {
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        System.out.println(start - 1);
    }
}
