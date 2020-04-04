package io.bhuwan;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
		*/
public class TwoSumProblem {
	public static void main(String[] args) {
		System.out.println(getindices(new int [] {1,3,6,5}, 11)[1]);
		
		System.out.println(getindicesoorderofn(new int [] {1,3,6,5}, 11)[1]);
		
	}
	
	
// This will run in O(n^2)	
	static int [] getindices(int [] inputnum, int target) {
	int [] result = new int[2];
	result[0]=-1;
	result[1]=-1;
	for(int i=0; i< inputnum.length; i++ )
	{
		for(int j=i+1; j< inputnum.length; j++ )
		{
			if(i!=j) {
				if((inputnum[i]+inputnum[j])==target) {
					result[0]=i;
					result[1]=j;
					return result;
				}
					
			}
		}	
	}
	return result;
}	

	// This will run in O(n)	

	static int [] getindicesoorderofn(int [] inputnum, int target) {
		int [] result = new int[2];
		Map<Integer, Integer> temp=  new HashMap<>(); 
		for(int i=0; i< inputnum.length; i++ )
		{
			if(temp.containsKey(target-inputnum[i])) {
				result[0]=temp.get(target-inputnum[i]);
				result[1]=i;
				return result;
			} else
				temp.put(inputnum[i],i);
		}
		
		return result;
	}
}
