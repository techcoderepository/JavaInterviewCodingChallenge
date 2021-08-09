package anuj.bhaiya;

// Total number of bits in binary number is (log2n)+1
// Height of a binary tree is (log2n)
// Total number of digits in decimal number is (log10n)+1


public class CountSetBit {
	public static void main(String[] args) {
		System.out.println(countSetBit(7));
		}

	static int  countSetBit(int input) {  // Time complexity will be O(log2n), where 2 is radix or base 	
	int count =0;
	while(input != 0 ){ 	 	
		count=count+(input&1);
		input=input>>1;
		}
	return count;
	}
}