package step5;

import java.util.Scanner;

public class Number_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] subject = new int[n];
		int M = 0;
		int sum = 0;
		
		for (int i = 0; i < subject.length; i++) {
			subject[i] = sc.nextInt();
			if (M < subject[i]) {
				M = subject[i];	
			}
			sum = subject[i]+sum;
		}
		System.out.println((sum*100.0/M)/n);				//순차적으로 연산
		
	}
}
