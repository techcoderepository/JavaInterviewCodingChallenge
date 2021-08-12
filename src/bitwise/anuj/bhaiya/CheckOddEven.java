package bitwise.anuj.bhaiya;

public class CheckOddEven {

	public static void main(String[] args) {
		int input =332322;
		int masknum=1;	
		
		System.out.println(Integer.toString(input,2));  // decimal to binary;
		
		long startTime = System.nanoTime();
			
		if((input & masknum) == 1) {
				System.out.println("Odd");
			}else {
				System.out.println("Even");
			}
		
		long stopTime = System.nanoTime();
		System.out.println(stopTime - startTime);
	}

}
