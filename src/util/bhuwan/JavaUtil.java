package util.bhuwan;

public class JavaUtil {
	public static void main(String args[]) {
		//System.out.println(swap((new int[] {1,2,3,4}), 1,2));
		
	}
	
	public static void  swap(int [] a, int i, int j) {
		a[i]=a[i]^a[j];
		a[j]=a[i]^a[j];
		a[i]=a[i]^a[j];
	}

}
