package step4;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoonPractice2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int count = 0;
		int count1;
		
		String D = Integer.toString(A*B*C);
		
		String[] E = D.split("");
	
		for (int i = 0; i < E.length; i++) {
			if(E[i].equals("0")) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		for (int i = 1; i < 10; i++) {
			count1=0;
			for (int j = 0; j < E.length; j++) {
				
				int intValue = Integer.parseInt(E[j]);
				if(intValue == i) {
					count1 ++;
				}
			}
			System.out.println(count1);
		}
	}

}
