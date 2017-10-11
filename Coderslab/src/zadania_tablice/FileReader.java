package zadania_tablice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		StringBuffer buff = new StringBuffer(); //można dać stringbuffer i go append'ować o każdy wiersz z pliku
		
		File file = new File("nowy plik.txt");
		Scanner scan = new Scanner(file);

		while (scan.hasNextLine()) {
			String buff1 = scan.nextLine();
			buff.append(scan.nextLine() + " strbuff \n");
			System.out.println(buff1);
		}
			System.out.println(buff.toString());

		
	}

}
