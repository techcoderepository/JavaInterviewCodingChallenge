package anuj.bhaiya;

public class SwapNumbers {

	public static void main(String[] args) {
		int firstNumber =10;
		int secondNumber=20;
		long startTime = System.nanoTime();
		firstNumber=firstNumber^secondNumber;
		secondNumber=firstNumber^secondNumber;
		firstNumber=firstNumber ^secondNumber;
		System.out.println("firstNumber:- "+ firstNumber + " secondNumber:-"+secondNumber);
		long stopTime = System.nanoTime();
		System.out.println(stopTime - startTime);
	}
}
