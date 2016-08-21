package chapter03;

import java.util.Scanner;

public class Problem522 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(a == b) {
			
			System.out.println(true);
			
		}else{ 
			System.out.println(false);
		}
		
		if(b != a) {
			System.out.println(true);
		}else{ 
			System.out.println(false);
	}
}
}