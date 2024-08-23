package array.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class PickFromBothSide {
	public static void main(String [] args) {
		ArrayList<Integer> test=  new ArrayList<>(Arrays.asList(-55, -91, -791, 758, -779, -412, -578));
		System.out.println(BhuwanSoluntion(test,6));
		System.out.println(InteviewbitSoluntion(test, 6));
	}   
	
	// Time Complexity- O(N^2), Space Complexity- O(1)
	public static int BhuwanSoluntion(ArrayList<Integer> A, int B) {
	        int maxSum=-999999999;
	        for(Integer i=0;i<=B;i++){        
	            int currsum=0;
	            for(Integer j=B-i; j>0;j--){
	                currsum+=A.get(j-1);
	            }
	            for(Integer k=A.size(); k>A.size()-i; k--){
	                currsum+=A.get(k-1);
	            }
	            if(maxSum<currsum)
	                maxSum=currsum;            
	        }
	        return maxSum;
	    }
	
	// Time Complexity- O(N), Space Complexity- O(1)
		public static int InteviewbitSoluntion(ArrayList<Integer> A, int B) {
		        int maxSum=0;
		        for(Integer i=0;i<B;i++){        
		        	maxSum+=A.get(i);
		        }
		        if(B==A.size()) {
		        	return maxSum;
		        }
		        
		        int startpoint=B-1;
		        int endPoint=A.size()-1;
		        int currsum=maxSum;
		            for(Integer j=startpoint; j>=0;j--){
		                currsum-=A.get(j);
		                currsum+=A.get(endPoint);
		                maxSum=Math.max(maxSum, currsum);
		                endPoint--;
		            }
		               return maxSum;
		    }
}
