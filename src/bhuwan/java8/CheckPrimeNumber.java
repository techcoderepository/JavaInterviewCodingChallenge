package bhuwan.java8;

import java.util.stream.IntStream;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(isPrime(7));

	}
	
public static boolean isPrime (int i) {
		return i>1 && IntStream.range(2,i).noneMatch(j-> j%2==0);

	}

}
