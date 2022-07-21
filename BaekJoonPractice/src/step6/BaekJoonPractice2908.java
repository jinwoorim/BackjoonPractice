package step6;

import java.util.Scanner;

public class BaekJoonPractice2908 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strList = str.split(" ");
		
		StringBuffer sb1 = new StringBuffer(strList[0]);
		StringBuffer sb2 = new StringBuffer(strList[1]);
		
		String reverse1 = sb1.reverse().toString();
		String reverse2 = sb2.reverse().toString();
		
		int num1 = Integer.parseInt(reverse1);
		int num2 = Integer.parseInt(reverse2);
		
		if(num1 > num2) {
			System.out.println(num1);
		}
		else if(num1 < num2) {
			System.out.println(num2);
		}
	}

}
