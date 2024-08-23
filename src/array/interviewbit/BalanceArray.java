package array.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;

public class BalanceArray {
	public static void main(String [] args) {
		ArrayList<Integer> test=  new ArrayList<>(Arrays.asList(5, 5, 2, 5, 8));
		System.out.println(Bhuwansolution(test));
		
	}
	    public static int Bhuwansolution(ArrayList<Integer> A) {
	        ArrayList<Integer> temp = new ArrayList<Integer>();
	        int specialElementCount=0;
	        for(int i=0;i<A.size();i++){
	        	int oddIndexSum=0;
		        int evenIndexSum=0;
	            temp.clear();
	            temp.addAll(A);
	            temp.remove(i);
	            for(int j=0;j<temp.size();j+=2)
	            {
	                oddIndexSum+=temp.get(j);
	            }
	            for(int j=1;j<temp.size();j+=2)
	            {
	                evenIndexSum+=temp.get(j);
	            }
	            if(oddIndexSum !=0 && evenIndexSum!=0 && oddIndexSum==evenIndexSum) {
	            System.out.println(A.get(i));
	            	specialElementCount++;
	            }
	        }
	        return specialElementCount;
	    }
	}
