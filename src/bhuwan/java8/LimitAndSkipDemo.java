package bhuwan.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitAndSkipDemo {

	public static void main(String[] args) {
		System.out.println(Stream.of(1,2,34,5).limit(2).collect(Collectors.toList()));
		System.out.println(Stream.of(1,2,34,5).skip(2).collect(Collectors.toList()));

	}
	
	

}
