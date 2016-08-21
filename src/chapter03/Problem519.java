package chapter03;

import java.util.Scanner;

public class Problem519 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum;
		int sum2;
		
		sum = a + 100;
		sum2 = b % 10;
		
		System.out.println(sum);
		System.out.println(sum2);
	}
}
