package io.bhuwan;

public class FindLongestPalindromeSubstring {

	public static void main(String[] args) {

		System.out.println(isPalindrome("abcbaa"));
	}
	
	private static boolean isPalindrome(String input) {
		return (input.equalsIgnoreCase(new StringBuilder(input).reverse().toString()));  
	}

}
