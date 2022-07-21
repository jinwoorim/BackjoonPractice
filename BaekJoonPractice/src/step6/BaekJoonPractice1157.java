package step6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoonPractice1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		str = str.toUpperCase(); //소문자를 대문자로 변환
		ArrayList<Character> list = new ArrayList<Character>();
		int max = 0;
		char maxchar = ' ';
	
		for (int i = 0; i < str.length(); i++) {
			list.add(i, str.charAt(i));
		}
		
		for (int i = 0; i < list.size(); i++) {
			if(max < Collections.frequency(list, str.charAt(i))) {
				max = Collections.frequency(list, str.charAt(i));
				maxchar = str.charAt(i);
			}
			else if(maxchar != str.charAt(i) && max == Collections.frequency(list, str.charAt(i))) {
				maxchar = '?';
			}
		}
		
		System.out.println(maxchar);
		
	}

}
