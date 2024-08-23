package collections.anuj.bhaiya;

import java.util.HashSet;

//input : [5,10,5,4,5,10]
// output 3
public class BhuwanSet {

	public static void main(String[] args) {
		int a [] = new int [] {2,3,4};
		int b [] = new int [] {5,8,3,2};
		//findUnionOfTwoArraysBF(a,b );
		
		/*
		 * for(Integer i: findUnionOfTwoArraysOptimized(a,b)) { System.out.println(i); }
		 */
		
		findIntersectionOfTwoArraysOptimized(a,b);

	}
	
	// Time Complexity isO((n+m)*(n+m)), Space Complexity is O(n+m)
	static void findUnionOfTwoArraysBF(int a[], int b[]) {
		 a = distinctElementsBF(a);
		 b = distinctElementsBF(b);
		int [] result = new int [a.length+b.length];
		int k=0;
		
		for(int i=0; i< a.length; i++) {
			result[k++]=a[i];
		}
		for(int i=0; i< b.length; i++) {
			result[k++]=b[i];
		}
	
		result=distinctElementsBF(result);
		
		for(int l:result) {
			System.out.println(l);
		}
	}
	
	// Time Complexity is O(n+m), Space Complexity is O(n+m)
	static HashSet<Integer> findUnionOfTwoArraysOptimized(int a[], int b[]) {
		HashSet<Integer> result = new HashSet<>();
		for(int i:a) {
			result.add(i);
		}
		for(int i:b) {
			result.add(i);
		}
		return result;
	}
	
	
	// Time Complexity isO((n+m)*(n+m)), Space Complexity is O(n+m)
		static void findIntersectionOfTwoArraysBF(int a[], int b[]) {
			 a = distinctElementsBF(a);
			 b = distinctElementsBF(b);
			int [] result = new int [Math.min(a.length,b.length)];
			int k=0;
			
			for(int i=0; i< a.length; i++) {
				for (int j =0; j<b.length; j++) {
					if(a[i]==b[j]) {
						result[k++]=a[i];
						break;
					}
				}
				
			}
			int [] finalResult = new int [k];
			for (int i =0; i<finalResult.length; i++) {
				finalResult[i]=result[i];
			}
			
			for(int i:finalResult) {
				System.out.println(i);
			}
		}
		
		// Time Complexity isO((n+m)*(n+m)), Space Complexity is O(n+m)
				static void findIntersectionOfTwoArraysOptimized(int a[], int b[]) {
					HashSet<Integer> result = new HashSet<>();
					HashSet<Integer> finalResult = new HashSet<>();
					for(int i:a) {
						result.add(i);
					}
					
					for(int i:b) {
						if(result.contains(i)) {
							finalResult.add(i);
						}
							
					}
					for(int i:finalResult) {
						System.out.println(i);
					}
			}
		
		// Time Complexity isO(n^2), Space Complexity is O(1)
		static int countDitinctElementsBF(int a[]) {
			int count =0;
			boolean duplicate=false;
			int i=0;
			int j=0;
			
			for(; i< a.length; i++) {
				duplicate=false;
				j=0;
				for (; j<=i ; j++) {
					if(a[i]==a[j]) {
						duplicate=true;
						break;
					}
				}
				if(duplicate && i==j) {
					count++;
				}
			}
			return count;
		}
		
		static int [] distinctElementsBF(int a[]) {
			int result [] = new int [countDitinctElementsBF(a)];
			boolean duplicate=false;
			int i=0;
			int j=0;
			int k=0;
			
			for(; i< a.length; i++) {
				duplicate=false;
				j=0;
				for (; j<=i ; j++) {
					if(a[i]==a[j]) {
						duplicate=true;
						break;
					}
				}
				if(duplicate && i==j) {
					result[k++]=a[i];
				}
			}
			return result;
		}
		
		// Time Complexity isO(n), Space Complexity is O(n)
		static int countDitinctElementsOptimized(int a[]) {
			HashSet<Integer> temp = new HashSet<>();
			for(int i:a) {
				temp.add(i);
			}
			return temp.size();
		} 

}
