package bhuwan.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordsInString{

	public static void main(String[] args) {
		List<String> strList= Arrays.asList("Welcome to java world and explore java".split(" "));
		System.out.println(strList.stream().
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
	}
}
