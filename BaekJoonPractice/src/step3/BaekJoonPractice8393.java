package step3;

import java.util.Scanner;

public class BaekJoonPractice8393 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int total = 0;
		for (int i = 0; i <= n; i++) {
			total = count + i;
			count = count+i;
		}
		System.out.println(total);
	}

}
