package step7;

import java.util.Scanner;

public class BaekJoonPractice1193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int count = 0;
		
		for (int i = 1; i < 10000000; i++) {
			if(X <= count) {
				if((i-1)%2 == 0) {
					System.out.println(((i-1)-(count-X)) + "/" + ((i-1)-((i-1)-(count-X+1))));
				break;
				}
				else {
					System.out.println(((i-1)-((i-1)-(count-X+1))) + "/" + ((i-1)-(count-X)));
				break;
				}
			}
			else {
				count = count + i;
			}
		}
	}

}
