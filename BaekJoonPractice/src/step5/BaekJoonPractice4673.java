package step5;

import java.util.ArrayList;

public class BaekJoonPractice4673 {

	public static int Number(int n) {

		if(0<n && n<10){
			return n+n;
		}
		else if(10<=n && n<100) {
			int a = n/10;
			int b = n%10;
			return n+a+b;
		}
		else if(100<=n && n<1000) {
			int a = n/100;
			int b = n%100/10;
			int c = n%100%10;
			return n+a+b+c;
		}
		else {
			int a = n/1000;
			int b = n%1000/100;
			int c = n%1000%100/10;
			int d = n%1000%100%10;
			return n+a+b+c+d;
		}	
	}

	public static void main(String[] args) {

		ArrayList<Integer> nonSelfNumberList = new ArrayList<Integer>();
	
		for (int i = 1; i < 10000; i++) {
			nonSelfNumberList.add(Number(i));
		}
		
		for (int i = 1; i < 10000; i++) {
			
			if(nonSelfNumberList.contains(i) == false) {
				System.out.println(i);
			}
			
			}
		}
}
