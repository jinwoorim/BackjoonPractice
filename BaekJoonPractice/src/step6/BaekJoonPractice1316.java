package step6;

import java.util.Scanner;

public class BaekJoonPractice1316 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = N;
		
		for (int i = 0; i < N; i++) {
			String word = sc.next();
			boolean test[] = new boolean[26];
			
			for (int j = 0; j < word.length()-1; j++) {
				if(word.charAt(j) != word.charAt(j+1)) {
					if(test[word.charAt(j+1)-97] == true) {
						count --;
						break;
					}
				}
				test[word.charAt(j)-97] = true;
			}
		}
		System.out.println(count);
	}

}
