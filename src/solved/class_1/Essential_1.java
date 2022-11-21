package solved.class_1;

import java.util.Arrays;
import java.util.Scanner;

//음계 문제
public class Essential_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        String answer = "";
        for(int i = 0; i < arr.length; i++){    //8개의 숫자를 입력
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int j = 0; j < arr.length -1; j++){
            if(arr[j]+1 == arr[j+1]){           //입력받은 앞의 수보다 뒷 수가 크면 ascending
                    answer = "ascending";
            }else if(arr[j]-1 == arr[j+1]){     //입력받은 앞의 수보다 뒷 수가 작으면 descending
                    answer = "descending";
            }else{                              //둘다 아니면 mixed
                answer = "mixed";
                break;
            }

        }
        System.out.println(answer);
    }
}
