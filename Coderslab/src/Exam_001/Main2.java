package Exam_001;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		
		for (int i=0; i<10; i++)
			str.append("interation " + i)
			.append('\n');
		System.out.println(str.toString());
		
		String str1 = "00-100";
		String[] parts = str1.split("-");
		String part1 = parts[0];
		String part2 = parts[1];
		System.out.println(part1);
		System.out.println(part2);
		
		String str2 = "to jest do liczenia tokenów";
		StringTokenizer strTok = new StringTokenizer(str2);

		
		while (strTok.hasMoreTokens()) {
			System.out.println(strTok.nextToken());
		}
		
		String str3 = "dupa";
		String[] dupa = str3.split("p");
		
		System.out.println(Arrays.toString(dupa));

	}


}
