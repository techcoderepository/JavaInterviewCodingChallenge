package bitwise.anuj.bhaiya;

public class SetithBit {
	public static void main(String args[]) {
		int input =332323;
		int masknum=1;	
		int nthbit=4;
		
		System.out.println(Integer.toString(input,2));  // decimal to binary;
		
		long startTime = System.nanoTime();

		System.out.println(Integer.toString((input | masknum << (nthbit-1)), 2));
		
		long stopTime = System.nanoTime();
		System.out.println(stopTime - startTime);
	}

}
