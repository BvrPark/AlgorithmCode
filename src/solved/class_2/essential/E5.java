package solved.class_2.essential;

import java.util.Arrays;
import java.util.Scanner;

//직각삼각형(4153번)
public class E5 {
    public static void main(String[] args) {
        //입력 세팅
        Scanner sc = new Scanner(System.in);
        //세 변의 길이를 저장할 배열
        int[] arr = new int[3];

        while(true){
            //세변의 길이를 입력 받음
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            //처음 입력 받는 변의 길이가 0이면 반복문 탈출
            if(arr[0] == 0){
                break;
            }
            //길이를 오름차순으로 정렬
            Arrays.sort(arr);
            if(Math.pow(arr[0],2)+Math.pow(arr[1],2) == Math.pow(arr[2],2)){    //피타고라스 법칙
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }

        }
    }
}
