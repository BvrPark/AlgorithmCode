package step3;

import java.util.Scanner;

public class Number_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		int x = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (x > arr[i]) {
				System.out.print(arr[i] + " ");

			}
		}
	}

}
