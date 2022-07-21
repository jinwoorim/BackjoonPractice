package step5;

import java.util.Scanner;

class Test{
	
	 long sum(int[] a) {
	
		long sum =0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	} 
}

public class BaekJoonPractice15596 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Test test = new Test();
		
		int[] a = new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(test.sum(a));
	}

}
