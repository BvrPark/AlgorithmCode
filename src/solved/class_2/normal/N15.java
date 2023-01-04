package solved.class_2.normal;

import java.util.*;
import java.io.*;

//나무 자르기(2805번)
public class N15 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   //나무의 갯수
        int M = Integer.parseInt(st.nextToken());   //가져가려고 하는 나무의 길이
        int max = 0;   //나무의 최대높이, 마지막 지점
        int min;    //나무의 최소높이, 시작점
        int mid = 0; //중간값, 절단기 높이의 최대값
        long sum = 0;     //잘려나간 나무들의 합

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        min = max - M;

        while (min < max) {
            mid = (max + min) / 2;
            sum = 0;

            for (int i = 0; i < arr.length; i++) {
                long len = arr[i] - mid;
                if (len > 0) {
                    sum += len;
                }
                if(sum > M){
                    min = mid+1;
                    break;
                }
            }
            if(sum < M){
                max = mid;
            }else{
                min = mid+1;
            }
        }

        System.out.println(min-1);
    }
}
