package zadania_tablice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzBuzz {

	public static void main(String[] args) throws Exception {
		
		
		PrintWriter pr = new PrintWriter("nowy plik.txt");
//		pr.println("linia 1");
//		pr.println("linia 3");
		for ( int i = 1; i<101; i++) {
			
			if (i%3 == 0 ) {
				pr.println("fizz");
			}
			else if (i%5 == 0) {
				pr.println("buzz");
			}
			else {
				pr.println(i);
			}
	}
pr.close();		
			

	}

}
