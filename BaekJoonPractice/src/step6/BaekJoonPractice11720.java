package step6;

import java.util.Scanner;

public class BaekJoonPractice11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = sc.nextInt();
		String[] b = sc.next().split("");
		
		for (int i = 0; i < a; i++) {
			sum = sum + Integer.parseInt(b[i]);
		}
		
		System.out.println(sum);
	}

}
