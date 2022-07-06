package step4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoonPractice2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a = 0;
		
		for (int i = 0; i < 9; i++) {
			list.add(sc.nextInt());
		
		}
		for (int i = 0; i < 9; i++) {
			if(list.get(i) >= list.get(a)) {
				a =i;
			}
		}
		Collections.sort(list);
		System.out.println(list.get(8));
		System.out.println(a+1);
	
	}

}
