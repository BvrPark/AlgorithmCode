package step2;

import java.util.Scanner;

public class Number_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		String arr[] = time.split(" ");
		int hour = Integer.parseInt(arr[0]);
		int minute = Integer.parseInt(arr[1]);

		if (minute < 45) {
			if (hour > 0) {
				System.out.println((hour - 1) + " " + (minute + 15));
			} else if (hour == 0) {
				hour = 23;
				System.out.println(hour + " " + (minute + 15));
			}
		} else if (minute >= 45 && hour >= 0) {

			System.out.println(hour + " " + (minute - 45));

		}
	}

}
