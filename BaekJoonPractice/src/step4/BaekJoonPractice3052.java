package step4;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoonPractice3052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList();
		int count;
		int totalcount = 0;
		
		for (int i = 0; i < 10; i++) {
			list.add(sc.nextInt()%42);
		}
		
		for (int i = 0; i < 10; i++) {
			count = 0;
			for (int j = i+1; j < 10; j++) {
				if(list.get(i) == list.get(j)) {
					count++;
				}
			}
			if(count == 0) {
				totalcount++;
			}
		}
		
		System.out.println(totalcount);
	}

}
