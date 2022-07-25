package step7;

import java.util.Scanner;

public class BaekJoonPractice2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = 1;
		int number = 1;
		
		for (int i = 0; i < 100000000; i++) {
			number = number + (i*6);
			if(a > number) {
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);
	}

}
