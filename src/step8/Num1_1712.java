package step8;

import java.util.Scanner;

public class Num1_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();   //고정비용
        int B = sc.nextInt();   //가변비용
        int C = sc.nextInt();   //판매비용

        if(C<=B){                       //순수익(C-B)가 0이거나 더 적을 때
            System.out.println(-1);     //총 수입이 고정비용(A)을 넘을 수 없으므로 -1을 출력
        }else{                                  //순수익(C-B)가 0보다 클때
            //고정비용/순수익이 딱 0일 경우에는 총 수입과 총 비용이 같다는 것이므로 그것보다 1대를 더 판매해야 되므로 1을 더해야되고
            //고정비용/순수익이 1보다 작은 경우는 1대만 팔아도 되니까 0보다 작으면 int형으로 변환하면 0이되서 +1을 하면 되고
            //고정비용/순수익이 1보다 큰 경우도 마찬가지로 +1을 하면 판매갯수가 된다!!!
            System.out.println((A/(C-B))+1);
        }
    }

}
