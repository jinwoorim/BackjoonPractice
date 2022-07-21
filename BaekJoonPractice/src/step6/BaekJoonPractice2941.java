package step6;

import java.util.Scanner;

public class BaekJoonPractice2941 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'c' && str.charAt(i+1) == '=') {
				sum = sum+1;
				i++;
			}
			else if(str.charAt(i) == 'c' && str.charAt(i+1) == '-') {
				sum = sum+1;
				i++;
			}
			else if(str.charAt(i) == 'd' && str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') {
				sum = sum+1;
				i = i+2;
			}
			else if(str.charAt(i) == 'd' && str.charAt(i+1) == '-') {
				sum = sum+1;
				i++;
			}
			else if(str.charAt(i) == 'l' && str.charAt(i+1) == 'j') {
				sum = sum+1;
				i++;
			}
			else if(str.charAt(i) == 'n' && str.charAt(i+1) == 'j') {
				sum = sum+1;
				i++;
			}
			else if(str.charAt(i) == 's' && str.charAt(i+1) == '=') {
				sum = sum+1;
				i++;
			}
			else if(str.charAt(i) == 'z' && str.charAt(i+1) == '=') {
				sum = sum+1;
				i++;
			}
			else {
				sum = sum+1;
			}
		}
		System.out.println(sum);
	}
}
