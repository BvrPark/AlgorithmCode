package step5;

import java.util.Scanner;

public class Number_4{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] rest = new int[10];
		int temp = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			rest[i] = arr[i] % 42;
		}
		for (int i = 0; i < rest.length; i++) {
			temp = 0;
			for (int j = i + 1; j < rest.length; j++) {
				if (rest[i] == rest[j]) {
					temp++;
				}
			}
			if (temp == 0) {
				count++;
			}
		}
		System.out.println(count);

	}
}
