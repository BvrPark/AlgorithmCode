package step4;

import java.util.Scanner;

public class Number_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int number = input;
		int count = 0;
		do {
			number = ((number % 10) * 10) + (((number/10)+(number % 10)) % 10);
			count++;
		} while (number != input);
		System.out.println(count);
	}
}