package step2;

import java.util.Scanner;

public class BaekJoonPractice2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int D = (B+C)/60; // 몫
		int E = (B+C)%60; // 나머지
		
		if((B+C)<60) {
			System.out.println(A + " " + (B+C));
		}else if((B+C) == 60) {
			
			if(A < 23) {
				System.out.println(A+1 + " " + "0");
			}else {
				System.out.println("0" + " " + "0");
			}
		}else if((B+C) > 60) {
			if((A+D) <= 23) {
				System.out.println((A+D) + " " + E );
			}else {
				System.out.println(((A+D)%24) + " " + E);
			}
		}
	}

}
