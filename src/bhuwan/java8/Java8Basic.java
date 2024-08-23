package bhuwan.java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Basic {

	public static void main(String[] args) {
  List<Integer> mylist = Arrays.asList(new Integer []{1,3,8,50});
  // filter using stream 
   mylist.stream().filter(i-> i%2==0).forEach(j-> System.out.println("even numbers in list: "+j));
  //map using stream
  mylist.stream().map(i-> i*2).forEach(j-> System.out.println("double all list elements: "+j));
 
  
//peek using stream
  mylist.stream().filter(i->i>10).peek(System.out::print).map(i-> i*2).forEach(j-> System.out.println("double all list elements: "+j));
 
  //reduce using stream
  System.out.println("reduced output:- " + mylist.stream().reduce((a,b)->a+b).get());
 
//filter using parallelStream  
  mylist.parallelStream().forEach(j-> System.out.println("even numbers in list: "+j));
 //map using parallelStream
  System.out.println("double all list elements using map's parallelStream");
 mylist.parallelStream().forEach(j-> System.out.println(j));
 
 // Use of Stream.of()
 
 Stream.of(1,2,3,4).forEach(System.out::println);
 
 //use of Streams.toarray
 Object [] objects =Stream.of(1,2,3,4).toArray();
 for(Object obj:objects)
	 System.out.println(obj);
 
//use of Streams.toarray
 
 
//use of Streams.sorted
 
 
Stream.of(100,23,3,4).sorted((i1,i2)-> i2.compareTo(i1)).forEach(System.out::println);	  
List<Employee> empList = new ArrayList<>();
//Stream.of(empList).sorted((i1,i2)-> ).forEach(System.out::println);
	  
}
class Employee implements Comparable<Employee> {
	String name;
	Integer empId;
	Employee(String name, Integer empId){
		this.name=name;
		this.empId=empId;
	}
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.name);
	}
}
}

