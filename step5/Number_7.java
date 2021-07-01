package step5;

import java.util.Scanner;

public class Number_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int sum = 0;
		int avg = 0;
		int count = 0;
		int[] testCase = new int[test];
		for (int i = 0; i < testCase.length; i++) {
			testCase[i] = sc.nextInt();
			int[] grade = new int[testCase[i]];
			String[] ratio = new String[grade.length];
			count = 0;
			for (int j = 0; j < grade.length; j++) {
				grade[j] = sc.nextInt();
				sum += grade[j];
				avg = sum / grade.length;
			}
			for (int k = 0; k < grade.length; k++) {
				if (grade[k] > avg) {
					count++;
				}
				
			}
			ratio[i] = Double.toString(count * 100.0 / grade.length);
			System.out.println(ratio[i]);
		}

	}
}
