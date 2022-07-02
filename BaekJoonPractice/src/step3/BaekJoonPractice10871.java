package step3;

import java.util.Scanner;

public class BaekJoonPractice10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		String A = "";
		
		for (int i = 1; i <= N; i++) {
			int B = sc.nextInt();
			if(B<X) {
				A = A + B + " ";
			}
			
		}
		System.out.println(A);
	}

}
