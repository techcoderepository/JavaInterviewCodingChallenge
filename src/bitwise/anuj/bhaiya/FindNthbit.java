package bitwise.anuj.bhaiya;

// Find nth bit
public class FindNthbit {
		public static void main(String args[]) {
			int input =15;
			int masknum=1;	
			int nthbit=1;
			
			System.out.println(Integer.toString(input,2));  // decimal to binary;
			
			for(; nthbit<= Integer.toString(input,2).length(); nthbit++) {
			long startTime = System.nanoTime();

			System.out.println((input & (masknum << (nthbit-1))) >> nthbit-1 );
			
			long stopTime = System.nanoTime();
			System.out.println(stopTime - startTime);
		}
			
		}
		
		
	
		
}
