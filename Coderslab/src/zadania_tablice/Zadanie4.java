package zadania_tablice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Zadanie4 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = (rand.nextInt(21) - 10);
		}

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Najmniejszy element: " + arr[0] + '\n' + "Największy element: " + arr[9]);
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = +arr[i];
		}
		float sumFloat = (float) sum / 10;

		System.out.println("Suma to: " + sum + '\n' + "średnia to: " + sumFloat);
		
		List<Integer> lower = new ArrayList<Integer>();
		List<Integer> upper = new ArrayList<Integer>();
		for (int i=0; i<10; i++){
			if (arr[i] < sumFloat) {
				lower.add(arr[i]);
			}
			else {
				upper.add(arr[i]);
			}
			
		}
		System.out.println("liczby mniejsze od średniej: " + lower);
		System.out.println("liczby większe od średniej: " + upper);
		List<Integer> reverse = new ArrayList<Integer>();
		for (int i = 9; i>=0; i--) {
			reverse.add(arr[i]);
		}
		System.out.println("odwrócona lista: " + reverse);
		
		List<int[]> arrList = Arrays.asList(arr);
		
		System.out.println(arrList.toString());
	}

}
