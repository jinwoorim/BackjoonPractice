package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoonPractice15552 {

	public static void main(String[] args) throws Exception{

		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader buffreader = new BufferedReader(reader);
		
		OutputStreamWriter writer = new OutputStreamWriter(System.out);
		BufferedWriter buffwriter = new BufferedWriter(writer);
		
		StringTokenizer st; // 문자열을 공백을 기준으로 나눔
		
		int n = Integer.parseInt(buffreader.readLine()); // 문자열을 정수로 변환
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(buffreader.readLine());
			// 한줄의 문자열을 받아들임
			int A = Integer.parseInt(st.nextToken()); // 문자열을 정수로 변환
			int B = Integer.parseInt(st.nextToken());
			
			
			buffwriter.write((A+B) + "\n");
		}
		buffwriter.flush();
		
	}

}
