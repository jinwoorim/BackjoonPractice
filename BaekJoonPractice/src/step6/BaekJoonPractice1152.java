package step6;

import java.util.Scanner;

public class BaekJoonPractice1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.trim();
		String[] wordlist = str.split(" ");
		int count = 0;
		
		for (int i = 0; i < wordlist.length; i++) {
			if(wordlist[i].equals("")) {
				count = count +0;
			}else {
				count++;
			}
		}
		System.out.println(count);
	
	}
}
