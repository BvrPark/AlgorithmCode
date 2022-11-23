package solved.class_2.essential;


import java.io.*;
import java.util.*;

//좌표 정렬하기(11650번)
public class E10 {

    public static void main(String[] args) throws IOException {
        //입력 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //점의 갯수 입력 받음
        int n = Integer.parseInt(br.readLine());
        //점의 좌표를 넣을 배열 생성
        int[][] matrix = new int[n][2];
        //출력을 하기 전 모아둘 StringBuilder을 생성
        StringBuilder sb = new StringBuilder();

        //좌표를 x좌표와 y좌표를 따로 나누어서 matrix에 저장
        //BufferedReader로 입력을 받으면
        //Enter를 기준으로 입력 되므로 공백을 기준으로 나눠서 matrix에 넣어준다.
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            matrix[i][0] = Integer.parseInt(st.nextToken());
            matrix[i][1] = Integer.parseInt(st.nextToken());
        }

        //Comparator로 compare메서드를
        //x좌표가 같을 때 y좌표를 오름차순으로 정리하게 만들고
        //그 외의 나머지는 x좌표를 오름차순으로 정리하게 세팅
        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        //StringBuilder에 정리된 좌표들을 세팅해준 뒤, 출력한다.
        for (int i = 0; i < n; i++) {
            sb.append(matrix[i][0]).append(" ").append(matrix[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
