package chapter03;

import java.util.Scanner;

public class Problem518 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("합계 : ");
		System.out.println("평균 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum;
		int sum2;

		sum = a + b + c;
		sum2 = sum / 3;
		
		System.out.println(sum);
		System.out.println(sum2);
	}

}
