package solved.class_2.normal;

import java.io.*;
import java.util.*;

//통계학(2108번)
//카운팅 정렬 사용
public class N13 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] array = new int[8001];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int temp = 0;
        boolean b = false;

        int N = Integer.parseInt(br.readLine());
        int[] std = new int[N];
        List<Integer> cSort = new ArrayList<>();
        int sum = 0;
        int input;

        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(br.readLine());
            std[i] = input;
            array[input + 4000]++;
            sum += input;
            if (max < input) {
                max = input;
            }
            if (min > input) {
                min = input;
            }
        }

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (array[i] > 0) {
                for (int j = 0; j < array[i]; j++) {
                    cSort.add(i-4000);
                }
                if (count < array[i]) {
                    count = array[i];
                    temp = i - 4000;
                    b = true;
                } else if (count == array[i] && b == true) {
                    temp = i - 4000;
                    b = false;
                }

            }

        }

        sb.append(Math.round((double) sum / N)).append("\n");     //산술평균
        sb.append(cSort.get(N / 2)).append("\n");                     //중앙값
        sb.append(temp).append("\n");                               //최빈 값
        sb.append(max - min).append("\n");        //범위

        System.out.println(sb);

    }

}
