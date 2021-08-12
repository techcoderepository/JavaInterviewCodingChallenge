package bitwise.anuj.bhaiya;

public class FindOnlyNonRepeatingElementInArray {
	public static void main(String args[]) {
		System.out.println(findOnlyNonRepeatingElementInArray(new int[] {5,4,1,4,6,5,1}));
		int result[]=findTwoNonRepeatingElementInArray(new int[] {5,4,1,4,3,5,1,2});
		System.out.println(result[0] + "::"+result[1]);
	}

	//Find the only non - repeating element in an array where 
	//every elements except one repeat twice 
	// input :- [5,4,1,4,3,5,1]
	// Output 3.
 static int findOnlyNonRepeatingElementInArray(int input[]) {
	 int result=0;
	 for(int i=0; i<input.length;i++) {
		 result=result^ input[i];
	 }
	 
	 return result;
 }
 
//Find the two non - repeating element in an array where 
//every elements except two repeat twice 
//input :- [5,4,1,4,3,5,1,2]
//Output 3,2.
 static int [] findTwoNonRepeatingElementInArray(int input[]) {
	 int result []= new int [2] ;
	 int tempresult1 []= new int [input.length];
	 int tempresult2 []= new int [input.length];
	 int xorresult =0;
	 for(int i=0; i<input.length;i++) {
		 xorresult=xorresult^input[i];
	 }
	 
	 int pos=findFirstRightMostSetBitPosition(xorresult);
	 for(int i=0; i<input.length;i++) {
		 int temp= (input[i] >> pos);
		 if((temp & 1)  == 1)  {
			 tempresult1[i]=input[i];
			 tempresult2[i]=-1;
		 }else {
			 tempresult2[i]=input[i];
			 tempresult1[i]=-1;
		 }
	 }
	 
	 int i=0; 
	 xorresult=0;
		if (xorresult != -1) {
			for (i = 0; i < tempresult1.length; i++) {
				if(tempresult1[i] != -1) {
					xorresult = xorresult ^ tempresult1[i];
				}
			}
			result[0]=xorresult;
			xorresult=0;
			i=0;
		}	
				 
			if (xorresult != -1) {
				for (i = 0; i < tempresult2.length; i++) {
					if(tempresult2[i] != -1) {
						xorresult = xorresult ^ tempresult2[i];
					}
				}
				result[1]=xorresult;
				xorresult=-1;
				i=0;
			}
	 
	 return result;
 }
 
 static int findFirstRightMostSetBitPosition(int input) {
	 int firstRightMostSetBitPosition=-1;
	 while(input > 0) {
		 if((input & 1)==1) {
			 firstRightMostSetBitPosition++;
			 break;
		 }
		 input=input >> 1;
		 }
	 return firstRightMostSetBitPosition;
	 }
}
