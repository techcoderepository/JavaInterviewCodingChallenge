package bhuwan.java8;

//Muliply two numbers using Java 8 functional Interface
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		MultiplyTwoNumbers multiplyTwoNumbers = (i,j)-> i*j;
		System.out.println(multiplyTwoNumbers.multiply(6, 7));
	}
	
	
}


