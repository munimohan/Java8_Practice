package StreamAPI;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicates {
	
	public static void main(String[] args) {
		Stream<String> stream =Stream.of("arun","vinay","prasanth","anu","wilson","mohan" );  
		//Filter accepts a predicate to filter all elements of the stream. 
		//This operation is intermediate which enables us to call another stream operation (e.g. forEach) on the result.
		Predicate<String> p1= name -> name.length() > 3 ; 
		Predicate<String> p2= name -> name.contains("a") ; 
		stream.filter(p1.and(p2))
				.forEach(System.out::println);	
	}

}
