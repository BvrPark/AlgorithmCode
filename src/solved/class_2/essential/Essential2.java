package solved.class_2.essential;

import java.util.Scanner;

//최대 공약수와 최소 공배수
public class Essential2 {

    public static void main(String[] args) {
        Essential2 test = new Essential2();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(test.gcd(num1,num2));
        System.out.println(test.lcm(num1,num2));

    }

    //최대 공약수(GCD)
    int gcd(int a, int b){
        while(b!=0){
            int num = a%b;
            a=b;
            b=num;
        }
        return a;
    }

    //최소 공배수(LCM)
    int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
