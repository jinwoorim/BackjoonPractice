package step3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoonPractice2438 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
