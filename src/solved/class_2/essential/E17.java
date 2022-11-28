package solved.class_2.essential;

import java.util.*;
import java.io.*;

//수 찾기(1920번)
public class E17 {

    public static void main(String[] args) throws IOException {
        //입력 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력 세팅
        StringBuilder sb = new StringBuilder();
        //N을 입력 받음
        int n = Integer.parseInt(br.readLine());
        //N개의 정수 입력 받아서 저장할 곳
        int[] arr_n = new int[n];
        //N개의 정수를 입력 받아 저장
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr_n[i] = Integer.parseInt(st.nextToken());
        }
        //N개의 정수를 입력 받아 저장한 곳을 오름차순으로 정렬
        Arrays.sort(arr_n);

        //M을 입력 받음
        int m = Integer.parseInt(br.readLine());
        //M개의 정수를 입력 받아서 저장할 곳
        int[] arr_m = new int[m];
        //M개의 정수를 입력 받아 저장 후 StringBuilder에 저장
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            sb.append(binary(arr_n,Integer.parseInt(st.nextToken()))).append('\n');
        }

        System.out.println(sb);
    }

    //이분 탐색법을 적용할 메서드 생성
    public static int binary(int[] arr, int ans){
        //첫 인덱스와 마지막 인덱스를 임시로 넣는다.
        int first = 0;
        int last = arr.length-1;

        //first에 있는 값이 last에 있는 값보다 커지면 반복문 종료
        while(first <= last){
            // 중간값을 설정해준다.
            int mid = (first+last)/2;
            // 자세한 풀이는 블로그에 기재
            if(ans < arr[mid]){
                last = mid - 1;
            }else if(ans > arr[mid]){
                first = mid + 1;
            }else{
                return 1;
            }
        }
        return 0;

    }
}
