package step5;

import java.util.Scanner;

public class Number_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int min = 0;
		int max = 0;
		
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			if (n == 1) {
				min = arr[0];
				max = arr[0];
			} else {

			if (arr[0] > arr[1]) {
				min = arr[1];
				max = arr[0];
			} else {
				min = arr[0];
				max = arr[1];
			}
			for (int i = 2; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				} else if (arr[i] < min) {
					min = arr[i];
				}
			}
		}
		System.out.println(min + " " + max);
	}
}