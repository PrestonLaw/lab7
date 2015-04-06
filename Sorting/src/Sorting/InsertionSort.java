package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
		int[] sortedArray = Arrays.copyOf(unsortedArray);
		for (int i = 1; i < sortedArray.length; i++) {
			int j = i;
			while ((j > 0) && (sortedArray[j - 1] > sortedArray[j]) {
				int temp = sortedArray[j - 1];
				sortedArray[j - 1] = sortedArray[j];
				sortedArray[j] = temp;
				j = j - 1;
			}
		}
		
		return sortedArray;
	}
}
