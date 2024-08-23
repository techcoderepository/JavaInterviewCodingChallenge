package collections.anuj.bhaiya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Find the subarray with given sum
//input : [10,15,-5,15,-10,5],  sum=5 
// output sub array [15,-10]
public class BhuwanMap {

	public static void main(String[] args) {
		int a [] = new int [] {10,15,-5,15,-10,25};
		//findSubArrayforGivenSumsBF(a,5);
		//findSubArrayforGivenSumsOptimized(a,5);
		
				ArrayList<Integer> ret = new ArrayList<Integer>();
				List<Integer> temp = Arrays.asList(new Integer [] {10,15,-5,15,-10,25});
				for (int i = 0; i < temp.size()-10; i++) {
					ret.add(temp.get(i + 10));
				}
				for (int i = 0; i < 10; i++) {
					ret.add(temp.get(i));
				}
				ret.forEach(System.out::println);


	}
	
	// Time Complexity isO((n^2)), Space Complexity is O(1)
	static void findSubArrayforGivenSumsBF(int a[], int givenSum) {
		int currentSum=0;
		boolean flag = false;
		for(int i=0; i< a.length; i++) {
			currentSum=a[i];
			if(givenSum ==currentSum) {
				System.out.println("Sub array starts at " +i  +" and ends at " +i);
				break;
			}
			for(int j=i+1; j< a.length; j++) {
				currentSum+=a[j];
				if(givenSum ==currentSum) { 
					System.out.println("Sub array starts at " +i  +" and ends at " +j);
					flag=true;
					break;
				}
			
			}
			if(flag)
				break;
		}
	}
	
	
	// Time Complexity isO(n), Space Complexity is O(n)
		static void findSubArrayforGivenSumsOptimized(int a[], int givenSum) {
			int currentSum=0;
			boolean flag = false;
			HashMap<Integer, Integer> subArray = new  HashMap<>(); 
			for(int i=0; i< a.length; i++) {
				currentSum+=a[i];
				if(givenSum ==currentSum) {
					System.out.println("Sub array starts at 0 "   +" and ends at " +i);
					break;
				}

				if(subArray.containsKey(currentSum-givenSum)) {
					System.out.println("Sub array starts at "  +(subArray.get(currentSum-givenSum) +1)  +" and ends at " +i);
					break;
				}
					
				subArray.put(currentSum, i);
			}
		}
}
