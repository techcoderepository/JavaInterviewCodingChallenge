package io.bhuwan;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reverseStringUsingAPI("COVID-19"));
		System.out.println(reverseStringWithoutUsingAPI("COVID-19"));

	}

	static String reverseStringUsingAPI(String input) {
		StringBuilder sb= new StringBuilder(input);
		return sb.reverse().toString();
	}
	
	static String reverseStringWithoutUsingAPI(String input) {
		StringBuilder sb= new StringBuilder();
		for(int i=input.length()-1; i>=0; i--) {
			sb.append(input.charAt(i));
		}
		
		return sb.toString();
	}

}
