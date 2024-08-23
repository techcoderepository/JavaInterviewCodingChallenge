package bhuwan.java8;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8StreamOperationsDemo {
	
	
	//1. **filter**	*Question:* Fetch all numbers from a list that are greater than 5.
	
	List <Integer> filterElements(List<Integer> list) {
		
		return list.stream().filter(e -> e > 5).collect(Collectors.toList());		
		
	}

	 //**map***Question:* Transform a list of strings into a list of their uppercase versions
	
	List<String> transformListtoUppperCase(List<String> list) {
		return list.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
  
	//**flatMap**	*Question:* Given a list of lists of strings, flatten them into a single list of strings.

	List<String> flattenListOfList(List<List<String>> list) {
		return list.stream().flatMap(Collection::stream).collect(Collectors.toList());
	}

	//**distinct**	*Question:* Remove duplicates from a list of integers.
	
	List<String> removeDuplicate(List<String> list) {
		return list.stream().distinct().collect(Collectors.toList());
	}
	
	//**sorted** 	*Question:* Sort a list of names in reverse alphabetical order.
	
	List<String> sortListDescending(List<String> list) {
		return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}
	
     //	**peek** *Question:* Print each element in a list while converting them to uppercase.
	
	List<String> transformAndPrintListtoUppperCase(List<String> list) {
		return list.stream().peek(word -> System.out.print(word)).map(String::toUpperCase).collect(Collectors.toList());
	}
	
	// **limit**	*Question:* Fetch the first 3 elements from a list of integers.
	
	List <Integer> fetchFirstnElements(List<Integer> list, int n) {
		
		return list.stream().limit(n).collect(Collectors.toList());
		
	}
	
	//**skip**	*Question:* Skip the first 4 elements and fetch the remaining elements from a list of integers.

	List <Integer> skipFirstnElements(List<Integer> list, int n) {
		
		return list.stream().skip(n).collect(Collectors.toList());
		
	}
	
	// **forEach** *Question:* Print each element of a list of strings with a prefix "Item: ".
	
	void printEachElements(List<Integer> list) {
		
		list.stream().forEach(item -> System.out.println("Item: " +item));		
	}
	
	// **collect**	*Question:* Collect a list of integers into a Set.
	
	Set<Integer> collectIntoSet(List<Integer> list) {
		
		return list.stream().collect(Collectors.toSet());		
	}
	
	//**reduce** 	*Question:* Compute the product of all numbers in a list.
	
	Integer getProductofElements(List<Integer> list) {
		
		return list.stream().reduce( (a,b) -> a*b).get();		
	}
	
	/* **allMatch** 

	The allMatch method in Java Streams is used to check if all elements in the stream satisfy a given predicate. It returns true if every element in the stream matches the predicate, and false otherwise.

	*Short-Circuiting:* The allMatch operation is short-circuiting, meaning it stops processing as soon as it finds the first element that does not match the predicate. If it finds such an element, it immediately returns false.

	*Question:* Check if all numbers in a list are positive. 
	*/
	
	
	boolean areAllElementsPositive(List<Integer> list) {
		
		return list.stream().allMatch( e -> e >= 0);		
	}
	
	/*
	**anyMatch** 
	*	The anyMatch method checks whether *at least one element* in the stream matches a given predicate. It returns true as soon as it finds an element that satisfies the predicate and stops further processing. If no elements match, it returns false 

	anyMatch is short-circuiting, meaning it stops processing as soon as it finds the first element that matches the predicate, optimizing performance.
*/
	
	boolean isAnyElementsPositive(List<Integer> list) {
		
		return list.stream().anyMatch( e -> e >= 0);		
	}
/*	

	**noneMatch**

	The noneMatch method in Java Streams is used to check if *no elements* in the stream match a given predicate. It returns true if none of the elements satisfy the predicate and false if at least one element does.

	 Like allMatch and anyMatch, noneMatch is short-circuiting. It stops processing as soon as it finds the first element that matches the predicate and immediately returns false 

	*Question:* Check if no elements in a list are negative.
*/
	
	boolean checkNoElementsNegative(List<Integer> list) {
		
		return list.stream().noneMatch( e -> e < 0);		
	}
	
	/*
	
	**findFirst**	 is used to retrieve the *first element* in a stream that matches a given condition or simply the first element in the stream if no filtering is applied. It returns the first element wrapped in an Optional, which is a container object that may or may not contain a non-null value.

	 */
	
	Integer findFirstElements(List<Integer> list) {
		
		return list.stream().findFirst().get();		
	}
	
/*
	
	**findAny**	 is used to retrieve the *any element* in a stream that matches a given condition or simply the first element in the stream if no filtering is applied. It returns the first element wrapped in an Optional, which is a container object that may or may not contain a non-null value.

	 */
	
	Integer findAnyElements(List<Integer> list) {
		
		return list.stream().findAny().get();		
	}
	 
	
	public static void main(String[] args) {
		Java8StreamOperationsDemo java8StreamOperationsDemo = new Java8StreamOperationsDemo();
		System.out.println(java8StreamOperationsDemo.filterElements(List.of(10,20,30,1,4,3)));
		System.out.println(java8StreamOperationsDemo.transformListtoUppperCase(List.of("apple","banana","guava")));
		System.out.println(java8StreamOperationsDemo.flattenListOfList(List.of(List.of("apple","banana"), List.of("Guava","orange"))));
		System.out.println(java8StreamOperationsDemo.removeDuplicate(List.of("apple","apple","banana","guava")));
		System.out.println(java8StreamOperationsDemo.sortListDescending(List.of("apple","apple","banana","guava")));		
		System.out.println(java8StreamOperationsDemo.transformAndPrintListtoUppperCase(List.of("apple","banana","guava")));		
		System.out.println(java8StreamOperationsDemo.fetchFirstnElements(List.of(10,20,30,1,4,3), 4));		
		System.out.println(java8StreamOperationsDemo.skipFirstnElements(List.of(10,20,30,1,4,3), 4));
		java8StreamOperationsDemo.printEachElements(List.of(10,20,30,1,4,3));		
		System.out.println(java8StreamOperationsDemo.collectIntoSet(List.of(10,20,30,1,4,3)));
		System.out.println(java8StreamOperationsDemo.getProductofElements(List.of(10,20,30,1,4,3)));
		System.out.println(java8StreamOperationsDemo.areAllElementsPositive(List.of(10,20,30,1,4,3)));	
		System.out.println(java8StreamOperationsDemo.isAnyElementsPositive(List.of(-410,-10,30,1,4,3)));
		System.out.println(java8StreamOperationsDemo.checkNoElementsNegative(List.of(-410,-10,30,1,4,3)));
		System.out.println(java8StreamOperationsDemo.findFirstElements(List.of(-410,-10,30,1,4,3)));
		System.out.println(java8StreamOperationsDemo.findAnyElements(List.of(-410,-10,30,1,4,3)));	
		
	}


}
