package step3;

import java.util.Scanner;

public class Number_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; ++i) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; ++k) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
