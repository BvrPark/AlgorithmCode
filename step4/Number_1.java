package step4;

import java.util.Scanner;

public class Number_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean end = true;

		while (end) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a + b;
			if (a == 0 && b == 0) {
				end = false;
			} else {
				System.out.println(c);
			}
		}

	}

}
