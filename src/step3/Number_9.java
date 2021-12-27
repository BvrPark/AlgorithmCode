package step3;

import java.util.Scanner;

public class Number_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = "*";
		String b = "*";
		for (int i = 0; i < n; i++) {
			System.out.println(a);
			a = a + b;
		}

	}

}
