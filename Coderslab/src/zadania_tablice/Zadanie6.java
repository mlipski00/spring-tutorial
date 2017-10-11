package zadania_tablice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Zadanie6 {

	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = (rand.nextInt(10) - 5);
			}
		}
		int buffor1 = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(" " + matrix[i][j]);
				buffor1 = buffor1 + matrix[i][j];

			}

			System.out.println('\n' + " suma z wiersza: " + buffor1);
			buffor1 = 0;
		}
		int min = 0;
		int max = 0;
		List<Integer> listMin = new ArrayList<Integer>();
		List<Integer> listMax = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				if (max < matrix[j][i]) {
					max = matrix[j][i];
				} else {

				}
				if (min > matrix[j][i]) {
					min = matrix[j][i];
				} else {

				}
			}
			// System.out.println("Max z " + i + " kolumny: " + max + "\n" +
			// "Min z " + i + " kolumny: " + min + " ");
			listMin.add(min);
			listMax.add(max);
			max = 0;
			min = 0;

		}
		System.out.println("minima z kolumn: " + listMin + "\n" + "maxima z kolumn: " + listMax);
		List<int[]> matrixList = Arrays.asList(matrix);
		
		System.out.println(matrixList);

	}
}
