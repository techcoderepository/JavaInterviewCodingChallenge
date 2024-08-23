package sorting.anuj.bhaiya;

public class QuickSort {

	public static void main(String args[]) {
		int inputArray [] = new int[] {4,6,2,5,7,9,1,3};
		for(int element:inputArray)
			System.out.print(element + ", ");
		System.out.println( "---------- ");
		quickSortPartition(inputArray, 0, 7);
		//quickSort(inputArray);
		for(int element:inputArray)
			System.out.print(element + ", ");
		
	}
	
	static void quickSort(int [] inputArray) {
		for(int i=1 ; i< inputArray.length; i++) {
			int minElementIndex =i;
			int j=i;
			// Find min in unsorted array
			for( ;  j< inputArray.length; j++) {	
				if(inputArray[minElementIndex] > inputArray[j]) {
					minElementIndex=j;
				}
			}
		
			j=i-2;
			int minElement=inputArray[minElementIndex];
			for( ;  j >=0 && inputArray[j] > minElement; ) {
				// swap
				inputArray[minElementIndex]=inputArray[j];
				inputArray[j] = minElement;
				j--;
				for(int element:inputArray)
					System.out.print(element  + ", ");
				System.out.println();
			}
			System.out.println();
			}
		}	
	
	static void quickSortPartition(int [] inputArray, int low, int high) {
		int pivot= inputArray[low];
		int i= low;
		int j = high;
		while (i  < j)  {
		while(inputArray[i] <= pivot) {
			i++;
		}
		while(inputArray[j] > pivot) {
			j --;			
		}
		// swap
		int temp = inputArray[j];
		inputArray[j]= inputArray[i];
		inputArray[i]=temp;
	}
		if(i>j) {
			inputArray[low]=inputArray[j];
			inputArray[j]=pivot;
			}
	}
}