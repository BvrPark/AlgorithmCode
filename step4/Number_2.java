package step4;

import java.util.Scanner;

public class Number_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {				//hasNextInt()�� �Էµ� ���� ���ڸ� true�� ���ڰ� �ƴϸ� false�� ��ȯ�Ѵ�.
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a + b;
			System.out.println(c);
		}
	}

}
