package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoonPractice11021 {

	public static void main(String[] args) throws Exception{

		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader buffreader = new BufferedReader(reader);
	
		OutputStreamWriter writer = new OutputStreamWriter(System.out);
		BufferedWriter buffwriter = new BufferedWriter(writer);
		
		StringTokenizer st;
		
		int T = Integer.parseInt(buffreader.readLine());


		
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(buffreader.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			System.out.println("Case #" + i + ":" + " " + (A+B));
		}
		buffwriter.flush();
		reader.close();
		buffreader.close();
		writer.close();
		buffwriter.close();
	}
}
