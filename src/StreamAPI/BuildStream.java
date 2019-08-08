package StreamAPI;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BuildStream {
	public static void main(String[] args) {
		
		/*List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);*/
		
			// Using stream() method
			//Calling the method stream() on a list of objects returns a regular object stream
			Arrays.asList("a1", "a2", "a3")
		    .stream()
		    .findFirst()
		    .ifPresent(System.out::println);  // a1
			
			//using  Stream.of() to create a stream from a bunch of object references.
			Stream.of("a1", "a2", "a3")
		    .findFirst()
		    .ifPresent(System.out::println);  // a1
			
			//Using Wrapper type Streams
			//IntStreams can replace the regular for-loop utilizing IntStream.range():

				IntStream.range(1, 4)
				    .forEach(System.out::println);
				//Using Stream.generate() or Stream.iterate() functions
			     Stream<Date> stream = Stream.generate(() -> { return new Date();});
		         stream.forEach(p -> System.out.println(p));
		        
		         //Using String chars or String tokens 
		         IntStream stream1 = "12345_abcdefg".chars();
		         stream.forEach(p -> System.out.println(p));
		          
		         //OR
		          
		         Stream<String> stream11 = Stream.of("A$B$C".split("\\$"));
		         stream.forEach(p -> System.out.println(p));
		 
			
			
	}

}
