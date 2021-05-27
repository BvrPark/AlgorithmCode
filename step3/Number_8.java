package step3;

import java.util.Scanner;

public class Number_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int a[] = new int[n];
		int b[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			arr[i] = a[i] + b[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " + (a[i] + b[i]));
		}
	}

}
