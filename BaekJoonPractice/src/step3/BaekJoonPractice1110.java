package step3;

import java.util.Scanner;

public class BaekJoonPractice1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int A2 = A;
		
		int count=0;
		
		while(true) {
			String str = "";
			str = str + A2%10;
//			System.out.println(str);
			str = str + ((A2/10) +(A2%10))%10;
//			System.out.println(str);
			A2 =Integer.parseInt(str);
		
			count++;
			
			if(A2==A) {
				System.out.println(count);
				break;
			}
		}
	}
}
