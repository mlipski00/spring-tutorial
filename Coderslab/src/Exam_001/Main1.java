package Exam_001;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		System.out.println(rectangle(2, 3));



	int a1 = 0;
	int b1 = 1;
	int buff = 1;
	Scanner scan = new Scanner(System.in);System.out.println("podaj ile liczb fibo ma się wyświetlić:");
	int x = scan.nextInt();
	for(int i = x;i>0;i--)
	{
		
		System.out.println(buff);
		buff = b1 + a1;
		a1 = buff;
		b1 = buff -b1;
	}
}
	static int rectangle(int a, int b) {
		return a * b;
	}
}
