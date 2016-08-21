package chapter03;

import java.util.Scanner;

// 두 개의 정수를 입력받아 각각 후치 증가 연산자와 전치 감소 연산자를 사용하여 두 수의 곱을 구한 후 각각의 값을 출력하는 프로그램을 작성하시오.
public class Problem521 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum1;
		int sum2;
		int total;
		
		sum1 = a++;
		sum2 = --b;
		total = sum1 * sum2;
		
		System.out.print(sum1 + " " + sum2 + " " + total);
	
	}

}
