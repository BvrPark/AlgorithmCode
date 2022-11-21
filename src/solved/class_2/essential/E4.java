package solved.class_2.essential;

import java.util.Scanner;

//이항 계수1
public class E4 {

    public static void main(String[] args) {
        E4 test = new E4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(test.combi(n,k));
    }

    int combi(int n, int r){            //재귀를 이용하여 조합메서드를 만듬
        if(r == 0 || r == n){
            return 1;
        }
        return combi(n-1,r-1) + combi(n-1,r);
    }

}
