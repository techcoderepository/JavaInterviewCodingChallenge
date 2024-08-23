package bhuwan.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
	public static void main(String[] args) {
    System.out.println("Duplicate element in (3,4,3,5, 4) is "+ getDuplicates(Arrays.asList(3,4,3,5,4)) );
    System.out.println("Duplicate element in ('abc','pqr','abc') is "+ getDuplicates(Arrays.asList("abc","pqr","abc")));
	
	
	}

	protected static <Type> List<Type> getDuplicates(List<Type> input) {
		 Set<Type> temp= new HashSet<>();
		return input.stream().filter(e -> !temp.add(e)).collect(Collectors.toList());
		

	}

	
}
