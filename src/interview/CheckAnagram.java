package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CheckAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram1("ICEMAN", "CINEMA"));
		System.out.println(isAnagram1("ICEMAAN", "CINEMA"));
		System.out.println(isAnagram1(null, null));
		System.out.println(isAnagram1("abc", "abc"));
		
		System.out.println(isAnagram2("ICEMAN".toCharArray(), "CINEMA".toCharArray()));
		System.out.println(isAnagram2("ICEMAAN".toCharArray(), "CINEMA".toCharArray()));
		System.out.println(isAnagram2(null, null));
		System.out.println(isAnagram2("abc".toCharArray(), "abc".toCharArray()));
	}

	static boolean isAnagram1(String str1, String str2) {
		if (null != str1 && null != str2 && (str1.length() != str2.length())) {
			return false;
		} else if ((null != str1 && null == str2) || (null == str1 && null != str2)) {
			return false;
		} else if ((null == str1 && null == str2) || str1.equalsIgnoreCase(str2)) {
			return true;
		}

		boolean flag = false;
		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {
			Integer j = hm1.put(str1.charAt(i), 1);
			if (j != null) {
				hm1.put(str1.charAt(i), j + 1);
			}

			j = hm2.put(str2.charAt(i), 1);
			if (j != null) {
				hm2.put(str2.charAt(i), j + 1);
			}

		}

		Set<Character> st = hm1.keySet();

		for (Character c : st) {
			if (hm1.get(c) != hm2.get(c)) {
				flag = false;
				break;
			}
			flag = true;
		}

		return flag;
	}
	
	
	static boolean isAnagram2(char [] str1, char [] str2) {
		if (null != str1 && null != str2 && (str1.length != str2.length)) {
			return false;
		} else if ((null != str1 && null == str2) || (null == str1 && null != str2)) {
			return false;
		} else if ((null == str1 && null == str2) || Arrays.equals(str1, str2)) {
			return true;
		}else {
			Arrays.sort(str1);
			Arrays.sort(str2);
			return Arrays.equals(str1, str2);
		}
   }
}
