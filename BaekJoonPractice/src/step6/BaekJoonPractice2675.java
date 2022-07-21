package step6;

import java.util.Scanner;

public class BaekJoonPractice2675 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {

			int a = sc.nextInt();
			String s = sc.next();
			
			for (int k = 0; k < s.length(); k++) {
				for (int j = 0; j < a; j++) {
					System.out.print(s.charAt(k));
				}
			}
		}
		System.out.println();
	}
}
