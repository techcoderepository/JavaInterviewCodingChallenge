package sorting.anuj.bhaiya;

public class InsertionSort {

	public static void main(String args[]) {
		int inputArray [] = new int[] {10,6,3,4,3,6};
		insertionSortAnuj(inputArray);
		for(int element:inputArray)
			System.out.print(element + ", ");
		System.out.println( "---------- ");
		inputArray = new int[] {10,6,3,4,3,6};
		insertionSortBhuwan(inputArray);
		for(int element:inputArray)
			System.out.print(element + ", ");
		
	}
	
	static void insertionSortBhuwan(int [] inputArray) {
		for(int i=1 ; i< inputArray.length; i++) {
			int temp =inputArray[i];
			int j=i-1;
			for( ;  j >=0 && inputArray[j] > temp; ) {				
				inputArray[j+1] = inputArray[j];
				j--;
				for(int element:inputArray)
					System.out.print(element  + ", ");
				System.out.println();
			}
			inputArray[j+1] = temp;
			System.out.println();
			}
		}
	
	static void insertionSortAnuj(int [] inputArray) {
		for(int i=1 ; i< inputArray.length; i++) {
			int temp =inputArray[i];
			int j=i-1;
			while(j >=0 && inputArray[j] > temp ) {				
				inputArray[j+1] = inputArray[j];
				j--;
				
				for(int element:inputArray)
					System.out.print(element  + ", ");
				System.out.println();
			}
			inputArray[j+1]=temp;
			System.out.println();
			}
		}
	}
