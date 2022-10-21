package task5;

import java.util.Arrays;
import java.util.Random;


public class task5 {
	public static void main(String[] args) {
	
		Random random = new Random();
		int n = 5;
		int[] tableArray = new int[n];

		fillArray(random, tableArray);

		Arrays.sort(tableArray);
		System.out.println();

		int newSize = 0;
		int[] finalArray = getFinalArray(n, tableArray, newSize);

		System.out.println(Arrays.toString(finalArray));
	}

	private static int[] getFinalArray(int n, int[] tableArray, int newSize) {
		for (int i = 0; i < tableArray.length - 1; i++) {
			if (tableArray[i] == tableArray[i + 1]) {
				newSize++;
			}
		}
		int[] finalArray = new int[n - newSize];

		int j=0;
		for (int i = 0; i < tableArray.length-1; i++) {
			finalArray[0] = tableArray[0];
			if (tableArray[i+1] != tableArray[i]) {
				j++;
				finalArray[j] = tableArray[i+1];
			}
		}
		return finalArray;
	}

	private static void fillArray(Random random, int[] tableArray) {
		for (int i = 0; i < tableArray.length; i++) {
			tableArray[i] = random.nextInt(10);
		}

		
			System.out.print(Arrays.toString(tableArray));
		
	}
}