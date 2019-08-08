package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapFlatMapExample{
	
	public static void main(String[] args) {
		
		// The map is a stream operation which takes a another function as an argument.
		//The function should take each element of a stream as a parameter and return newly created/modified element as a response. 
		//The given function is then applied to each element of the stream
		
		Stream<String> stream =Stream.of("arun","vinay","prasanth","anu","wilson","mohan" ); 
		stream.filter((s) -> s.startsWith("a"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
            
		/*List<Person> l= ...;
		 Stream<Person> stream = list.stream();
		 Stream<Names> names =
		 					stream.map(person -> Person::getName());
		 * studentsstrea
        .map(Student::getName)
        .forEach(System.out::println);*/
		
		
		List<Integer> list1 = Arrays.asList(2,4,8,9,8,9,5); 
		List<Integer> list2 = Arrays.asList(3,6,9,12,15);
		List<Integer> list3 = Arrays.asList(2,4,6,8,10,12);
		
		List<List<Integer>> list = Arrays.asList(list1,list2,list3);
		System.out.println("List is "+list );
		
		/*list.stream().map(l -> l.size())
					.forEach(System.out::println);*/
		
		Function<List<?>, Integer> size = List::size;  
		list.stream().map(size)
		.forEach(System.out::println);
		
		Function <List<Integer>, Stream<Integer>> flatmapper = l->l.stream();
		list.stream().map(flatmapper)
		.forEach(System.out::println);
		
		Function <List<Integer>, Stream<Integer>> flatmapper1 = l->l.stream();
		list.stream().flatMap(flatmapper1)
		.forEach(System.out::print);
		
	}

}
