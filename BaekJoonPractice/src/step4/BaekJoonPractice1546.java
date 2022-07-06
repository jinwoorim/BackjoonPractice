package step4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoonPractice1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double max;
		double sum=0;
		
		ArrayList<Double> list = new ArrayList<Double>();
				
		for (int i = 0; i < N; i++) {
			list.add((double) sc.nextInt());
		}
		max = Collections.max(list);
		
		for (int i = 0; i < N; i++) {
			sum = sum + ((list.get(i)/max)*100);
		}
		
		System.out.println(sum/N);
	}

}
