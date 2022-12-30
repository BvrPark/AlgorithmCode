package solved.class_2.normal;

import java.io.*;
import java.util.*;

//통계학(2108번)
//카운팅 정렬 사용
public class N13 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N13 func = new N13();

        int N = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        int sum = 0;
        int num;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            arr.add(num);
            sum += num;
        }
        Collections.sort(arr);
        sb.append(String.format("%.1f", sum / N)).append("\n");     //산술평균
        sb.append(arr.get(N / 2)).append("\n");                     //중앙값
        sb.append(func.number(arr)).append("\n");                   //최빈 값
        sb.append(arr.get(N - 1) - arr.get(0)).append("\n");        //범위

        System.out.println(sb);

    }

    public int number(List<Integer> list) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : list) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }

    return 0;
    }
}
