import java.util.*;
import java.io.*;

public class Main{
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int num = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i =0; i< arr.length; i++){
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println(count);
    }
}