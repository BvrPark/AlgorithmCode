package step2;

import java.util.Scanner;

public class Number_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (1 <= a && a <= 4000) {
			System.out.println((a % 4 == 0) ? ((a % 400 == 0) ? "1" : (a % 100 == 0) ? "0" : "1") : "0");
		}
	}

}
