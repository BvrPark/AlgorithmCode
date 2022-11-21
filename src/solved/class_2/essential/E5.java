package solved.class_2.essential;

import java.util.Arrays;
import java.util.Scanner;

//직각삼각형
public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        while(true){
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            if(arr[0] == 0){
                break;
            }
            Arrays.sort(arr);           //어떤 배열에 넣지 않아도 arr자체가 정렬이 된다.
            if(Math.pow(arr[0],2)+Math.pow(arr[1],2) == Math.pow(arr[2],2)){    //피타고라스 법칙
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }

        }
    }
}
