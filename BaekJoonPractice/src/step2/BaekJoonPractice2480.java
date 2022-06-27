package step2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoonPractice2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		ArrayList list = new ArrayList(Arrays.asList(a,b,c));
		int max = (int) Collections.max(list);	
		
		if((a == b) && (b== c)) {
			System.out.println(10000 + (a*1000));
		}else if((a != b) && (b != c) && (a != c)) {
			System.out.println(max*100);
		}else {
			
			if(a == b) {
				System.out.println(1000 + (a*100));
			}else if(b == c) {
				System.out.println(1000 + (b*100));
			}else if(a == c) {
				System.out.println(1000 + (c*100));
			}
		}
	}

}
