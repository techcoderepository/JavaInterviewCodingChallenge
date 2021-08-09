package io.bhuwan;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MinionLaborShifts {

	public static void main(String[] args) {
		int [] arr = {1,3,5,3};
		for(int i:solution(arr, 0)) {
		System.out.println(i);
		}

	}


	private static int [] solution(int [] data, int n){
		LinkedHashMap<Integer, Integer> temp= new LinkedHashMap<>();
		ArrayList<Integer> output = new ArrayList();
		for(Integer i: data) {
			if(null == temp.get(i)) {
			temp.put(i,1);
			}else {
				temp.replace(i,temp.get(i)+1);
			}
		} 

		for(Integer i: data) {
			if(null !=temp.get(i))
			if(temp.get(i) <=n) {
				output.add(i);
			}
		} 

		return output.stream().mapToInt(Integer::intValue).toArray();

	}	
}
