package sorting.anuj.bhaiya;

public class SelectionSort {

	public static void main(String args[]) {
		int inputArray [] = new int[] {10,6,3,4,3,6};
		for(int element:inputArray)
			System.out.print(element + ", ");
		System.out.println( "---------- ");
		selectionSortBhuwan(inputArray);
		for(int element:inputArray)
			System.out.print(element + ", ");
		
	}
	
	static void selectionSortBhuwan(int [] inputArray) {
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
	}
