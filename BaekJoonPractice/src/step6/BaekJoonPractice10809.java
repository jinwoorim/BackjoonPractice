package step6;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoonPractice10809 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		String alpabet = "abcdefghijklmnopqrstuvwxyz";
		String[] array = alpabet.split("");
		ArrayList list = new ArrayList();
	
		for (int i = 0; i < array.length; i++) {
			list.add(-1);
		}
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(s[i] == array[j]) {
					list.set(j, i); 
				}	
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(list.get(i));
		}		
	}

}
