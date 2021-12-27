package step5;

import java.util.Scanner;

public class Number_6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		sc.nextLine();
		String[] OX = new String[n];
		String[][] arr = new String[n][];
		int[] sum = new int[n];
		for(int i = 0; i<OX.length;i++) {
			OX[i] = sc.nextLine();
			arr[i] = OX[i].split("");
			count = 0;
			for(int j = 0; j<OX[i].length();j++) {
				if(arr[i][j].equals("O")) {
					count++;
					sum[i] = sum[i]+count;
				}else{
					count = 0;
				}
			}
		}
		for(int i =0;i<sum.length;i++) {
			System.out.println(sum[i]);
		}
	}
}