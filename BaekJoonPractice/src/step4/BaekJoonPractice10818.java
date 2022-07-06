package step4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoonPractice10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList();
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		System.out.print(list.get(0) + " ");
		System.out.println(list.get(N-1));
	}

}
