package step2;

import java.util.Scanner;

public class BaekJoonPractice9498 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		if(A<=100 && A>=90) {
			System.out.println("A");
		}else if(A<=79 && A>=70) {
			System.out.println("B");
		}else if(A<=69 && A>=60) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
	}

}
