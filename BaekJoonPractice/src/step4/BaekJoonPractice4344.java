package step4;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoonPractice4344 {

	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList();
		
		int N = sc.nextInt();
		
		
		for (int i = 0; i < N; i++) {
			
			int K = sc.nextInt();
			int [] array = new int[K];
			int sum = 0;
			double average = 0;
			int count=0;
			
			for (int j = 0; j < array.length; j++) {
				array[j] = sc.nextInt();
			}
			for (int j = 0; j < array.length; j++) {
				sum = sum + array[j];
			}
			average = (sum/K);
			
			for (int j = 0; j < array.length; j++) {
				if(array[j] > average) {
					count++;
				}
			}
			System.out.printf("%.3f",(double)count/K*100);
			System.out.println("%");
		}
	
		
	}

}
