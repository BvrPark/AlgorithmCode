package step1;

import java.util.Scanner;

public class Number_11 {
	
	public static int print(int a) {
		return a/10;
	} 
    public static int print1(int a) {
    	return a/100;
    	
    }
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a < 1000 && b<1000 && a>99 && b>99){
            System.out.println(a*(b-(print(b)*10)));
            System.out.println(a*((print(b)*10)-(print1(b)*100))/10);
            System.out.println(a*(print1(b)));
            System.out.println(a*b);
        }
        
    }

}
