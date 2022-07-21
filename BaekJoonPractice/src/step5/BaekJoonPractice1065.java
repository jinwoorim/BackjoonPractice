package step5;

import java.util.Scanner;

public class BaekJoonPractice1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 99;
		
		if(n<100) {
			count = n;
		}
		else if(100<=n && n<1000) {
			for (int i = 100; i <= n; i++) {
				int a = i/100;
				int b = i%100/10;
				int c = i%100%10;
				
				if((b-a) == (c-b)) {
					count++;
				}	
			}
			
		}
		else {
			count = count + 45;
		}
		System.out.println(count);
	}
}
