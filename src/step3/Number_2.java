package step3;

import java.util.Scanner;

public class Number_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String arr1[] = new String[2 * n];
		int arr2[] = new int[2 * n];

		for (int i = 0; i < n; i++) {
			String a = sc.nextLine();
			String arr[] = a.split(" ");
			arr1[2 * i] = arr[0];
			arr1[(2 * i) + 1] = arr[1];
		}
		for (int i = 0; i < 2 * n; i++) {
			arr2[i] = Integer.parseInt(arr1[i]);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(arr2[2 * i] + arr2[(2 * i) + 1]);
		}

	}

}
