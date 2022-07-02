package step3;

import java.util.Scanner;

public class BaekJoonPractice2439 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			
			for (int j = N-i-1; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
