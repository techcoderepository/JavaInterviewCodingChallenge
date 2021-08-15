package sorting.anuj.bhaiya;

import util.bhuwan.JavaUtil;

public class BubbleSort {

	public static void main(String args[]) {
		int inputArray [] = new int[] {10,2,3,4,5,6};
		bubbleSort(inputArray);
		for(int element:inputArray)
			System.out.println(element);
		
	}
	
	static void bubbleSort(int [] inputArray) {
		for(int i=0 ; i< inputArray.length; i++) {
			boolean swapped = false;
			for(int j=0 ; j < inputArray.length-1; j++) {
				if(inputArray[j] > inputArray[j+1] ) {
					swapped=true;
					JavaUtil.swap(inputArray, j, j+1);
				}
				System.out.println(j);
			}
			if(!swapped) {
				break;
			}		
		}
		
		
	}
}
