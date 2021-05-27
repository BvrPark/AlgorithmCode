package step3;

import java.util.Scanner;

public class Number_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Case #" + (i + 1) + ": " + arr[i]);
		}
	}

}
