package step5;

import java.util.Scanner;

public class Number_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int count = 0;
		int[] arr = new int[9];
		String[] array = new String[9];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			array[i] = Integer.toString(arr[i]);
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		for(int i = 0;i<arr.length;i++) {
			if(max == arr[i]) {
				count = i;
			}
		}
		
		
		System.out.println(max);
		System.out.println((count+1));
	}
}
