package step8;

import java.util.Scanner;

public class Num1_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();                   //고정비용
        int B = sc.nextInt();                   //가변비용
        int C = sc.nextInt();                   //판매비용
        int count = 0;                          //판매갯수

        while(true){

            if((C-B)<=0) {                   //그 중에서도 순이익(C-B)가 적자일 경우
                System.out.println(-1);     //총수입이 흑자가 안나므로 -1출력
                break;
            }else if(A>=(C-B)*count){           //순이익(C-B)*판매갯수가 고정비용보다 작거나 같을때
                count++;                        //물건을 1개 더 판다.
            }else if(A<(C-B)*count){            //순이익(C-B)*판매갯수가 고정비용보다 많을때 = 총수입이 흑자일때
                System.out.println(count);      //판매갯수를 출력
                break;
            }
        }
    }

}
