package io.bhuwan;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static final Map<Character, Integer> romanChars = new HashMap<>();

	static {
		romanChars.put('I', 1);
		romanChars.put('V', 5);
		romanChars.put('X', 10);
		romanChars.put('L', 50);
		romanChars.put('C', 100);
		romanChars.put('D', 500);
		romanChars.put('M', 1000);
	}
	public static void main(String[] args) {

		System.out.println(romanToInteger("CVI"));

	}

	static int romanToInteger(String str) {
		int result=0;
		Character previous=null;
		if(null != str && !str.isEmpty()) {
			for(int i=0; i<str.length(); i++) {
				Character ctr = str.charAt(i);
				result+=romanChars.get(ctr);
				if(null != previous) {
					if(romanChars.get(ctr) > romanChars.get(previous)) {
						result-=romanChars.get(previous);
						result-=romanChars.get(previous);
					}
				}
				previous=ctr;
			}
		} else {
			return -1;
		}

		return result;
	}

}
