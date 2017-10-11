package zadania_tablice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Zadanie5 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] arr = new int[9];
		List<Integer> arrListBuf = new ArrayList<Integer>();
		for (int i = 0; i < 9; ) {
			arr[i] = rand.nextInt(9);
			arrListBuf.add(arr[i]);
			// System.out.println(i + " pp " + arr[i]);
			i++;
			for (Integer integer: arrListBuf) {
				while (integer == arr[i]) {
					System.out.println(arr[i] = rand.nextInt(9));
				}
			}
			//for (int j = 0; j < 9; j++) {
				//System.out.println(i + "   " + arr[i]);
				//System.out.println(j + "   " + arr[j]);
//				while (i!=j && arr[i] == arrBuff[j]) {
//					System.out.println("while");
//						System.out.println(arr[i] = rand.nextInt(2));
//					
//			//	}
			//}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	

}
