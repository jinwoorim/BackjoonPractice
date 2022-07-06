package step4;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoonPractice8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] str = new String[N];
		
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		for (int i = 0; i < N; i++) {
			int count=0;
			int sum =0;
			for (int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j) == 'O') {
					count++;
					sum = sum + count;
				}else {
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}

}
