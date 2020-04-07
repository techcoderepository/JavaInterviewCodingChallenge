package io.bhuwan;

public class IntegerToRoman {

	public static void main(String[] args) {
		System.out.println("int 3257 in roman--"+ integertoRoman(3557));
		System.out.println("int 6547 in roman--"+ integertoRoman(6547));

	}
	
	static String integertoRoman(int i) {
		
		StringBuilder sb = new StringBuilder(); 
		
		String ones [] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String tens [] = {"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String hundreds [] = {"", "C", "CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String thousands [] = {"", "M", "MM","MMM"};
		
		if(i >0 && i<4000) {
				sb.append(thousands[i/1000]);
				i=i%1000;			
				sb.append(hundreds[i/100]);
				i=i%100;			
				sb.append(tens[i/10]);
				i=i%10;			
				sb.append(ones[i/1]);
				return sb.toString();
		} else {
			return "Out of range of roman";			
		}
	}
}
