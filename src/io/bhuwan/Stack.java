package io.bhuwan;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

	private List<T> demoList = new ArrayList<T>();
	private  int size = 0;
	private  final int MAX_SIZE = 100;
	private  final int MIN_SIZE = 0;

	Stack(List<T> demoList) {
		this.demoList = demoList;
		this.size = demoList.size();
	}

	public static void main(String[] args) {
		List<String> virusList = new ArrayList();
		virusList.add("COVID-19");
		virusList.add("Bird Flu");
		virusList.add("AIDS");
		virusList.add("RSV");

		List<Integer> countList = new ArrayList<>();
		countList.add(100);
		countList.add(200);
		countList.add(300);

		Stack<String> demoStack = new Stack(virusList);

		System.out.println(demoStack.pop());
		System.out.println(demoStack.pop());
		demoStack.push("1st Push");
	
		System.out.println(demoStack.peek());
		
		demoStack.push("2nd Push");

		System.out.println(demoStack.pop());
		System.out.println(demoStack.pop());
		System.out.println(demoStack.pop());
		System.out.println(demoStack.pop());


		
		  Stack<Integer> countStack = new Stack(countList);
		  
		  System.out.println(countStack.pop()); 
		  System.out.println(countStack.pop());
		  countStack.push(400); 
		  countStack.push(500);
		  System.out.println(countStack.peek());
		  System.out.println(countStack.pop()); 
		  System.out.println(countStack.pop());
		  System.out.println(countStack.pop()); 
		  System.out.println(countStack.pop());

	}

	T pop() {
		if (size > MIN_SIZE) {
			Object ob = (T) demoList.get(--size);
			demoList.remove(size);
			return (T) ob;
		}

		return (T) "Empty Stack";
	}

	void push(T item) {
		if (size < MAX_SIZE) {
			demoList.add(item);
			size++;
		} else {
			System.out.println("Stack is Full");
		}
	}

	T peek() {
		if (size > MIN_SIZE) {
			Object ob = (T) demoList.get(size-1);
			return (T) ob;
		}
		return (T) "Empty Stack";
	}
}
