package bitwise.anuj.bhaiya;

// Total number of bits in binary number is (log2n)+1
// Height of a binary tree is (log2n)
// Total number of digits in decimal number is (log10n)+1


public class CountSetBit {
	public static void main(String[] args) {
		int input =75;
		System.out.println(Integer.toString(input,2));
		System.out.println(countSetBitUsingWhile(input));
		System.out.println(countSetBitUsingNNminus1(input));
		
		}

	static int  countSetBitUsingWhile(int input) {  // Time complexity will be O(log2n), where 2 is radix or base 	
	int count =0;
	while(input != 0 ){ 	 	
		count=count+(input&1);
		input=input>>1;
		}
	return count;
	}
	
	
	static int  countSetBitUsingNNminus1(int input) {  // Time complexity will be O(log2n), where 2 is radix or base 	
		int count =0;
		while(input != 0 ){ 	 	
			count=count+(input^(input-1));
			input=input>>1;
			}
		return count;
		}
	
}