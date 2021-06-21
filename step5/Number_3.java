package step5;

import java.util.Scanner;

public class Number_3{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] count = new int[10];
		for(int i = 0;i<count.length;i++) {
			count[i] = 0;
		}
		
		int times = a*b*c;
		String[] arr = Integer.toString(times).split("");
		for(int i = 0;i<arr.length;i++) {
			if(arr[i].equals("0")) {
				count[0]++;
			}
			else if(arr[i].equals("1")) {
				count[1]++;
			}
			else if(arr[i].equals("2")) {
				count[2]++;
			}
			else if(arr[i].equals("3")) {
				count[3]++;
			}
			else if(arr[i].equals("4")) {
				count[4]++;
			}
			else if(arr[i].equals("5")) {
				count[5]++;
			}
			else if(arr[i].equals("6")) {
				count[6]++;
			}
			else if(arr[i].equals("7")) {
				count[7]++;
			}
			else if(arr[i].equals("8")) {
				count[8]++;
			}
			else if(arr[i].equals("9")) {
				count[9]++;
			}
		}
		System.out.println(count[0]);
		System.out.println(count[1]);
		System.out.println(count[2]);
		System.out.println(count[3]);
		System.out.println(count[4]);
		System.out.println(count[5]);
		System.out.println(count[6]);
		System.out.println(count[7]);
		System.out.println(count[8]);
		System.out.println(count[9]);
		
		
	}
}

