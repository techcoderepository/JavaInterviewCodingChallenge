package io.bhuwan;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverseInteger(2147483647));

	}

	static long reverseInteger(int input) {
		long result=0;
		if(input >Integer.MAX_VALUE || input < Integer.MIN_VALUE) 
		{
			return result;
		}else {
			if(input > 0) {
				while(input > 0) {
					result=result*10+ input%10;
					input=input/10;
				}	
			}else {
				while(input < 0) {
					result=result*10+ input%10;
					input=input/10;
				}	
			}
		}
		return result;

	}
}


