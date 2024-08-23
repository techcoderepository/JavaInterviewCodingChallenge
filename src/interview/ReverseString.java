package interview;
import java.util.HashMap;
import java.util.Map;

public class ReverseString {
	public static void getMessage(Object obj) {
		System.out.println("Object Version "+ obj);
	}
	public static void getMessage(String str) {
		System.out.println("String version "+ str);
	}
	
	
	

	public static void main(String[] args) {
		Map m=new HashMap<Integer,Integer>();
		m.put(150,150);
		Integer i=(Integer) m.put(150, 150);
		if(i !=null)
		System.out.println("i:"+i.intValue());
		
		getMessage( null);
	//	System.out.println("Revers of abcdefgh is: "+reverseString_On("abcdefgh"));

	}

	//Order of n/2
	@SuppressWarnings("unchecked")
	public static String reverseString_On(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
		
	}
	
	public static String reverseString_Ologn(String str) {
		byte[] val = str.getBytes();
		StringBuilder sb = new StringBuilder(str);
		
		for(int i = str.length()-1; i>=0; i--) {
		sb.append(str.charAt(i));
		} 
		
		return sb.toString();
		
	}
}
