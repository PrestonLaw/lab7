package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		
		int temp;
		
		boolean finishFlag = true;
		
		int[] sortedArray = unsortedArray;
		
		while(finishFlag){
		  finishFlag = false;
		  for(int i = 0; i < unsortedArray.length - 1; i++){
		    if(sortedArray[i] > sortedArray[i + 1]){
		      temp = sortedArray[i + 1];
		      sortedArray[i + 1] = sortedArray[i];
		      sortedArray[i] = temp;
		      
		      finishFlag = true;
		    }
		  }
		}
		
		return sortedArray;
	}
	
	
}
