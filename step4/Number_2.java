package step4;

import java.util.Scanner;

public class Number_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {				//hasNextInt()는 입력된 값이 숫자면 true를 숫자가 아니면 false를 반환한다.
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a + b;
			System.out.println(c);
		}
	}

}
