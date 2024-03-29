/*package StreamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import LamdaExpression.Person;

public class CollectorsExample {
	public static void main(String... args) {
		
		List<Person> persons= new ArrayList();
		try(
			BufferedReader reader= new BufferedReader(new InputStreamReader(
									CollectorsExample.class.getResourceAsStream("people.txt")));
			
			Stream<String> stream= reader.lines();){
			
			stream.map(line ->{
				String[] s= line.split(" ");
				Person p= new Person(s[0].trim(), Integer.parseInt(s[1]));
				persons.add(p);
				return p;
			})
				.forEach(System.out::println);
		
		}catch(IOException ioe){
			System.out.println(ioe);
			
		}
		
		
		Stream<Person> stream = persons.stream();
		Optional<Person> opt= stream.filter(p -> p.getAge() >= 20)
				.min(Comparator.comparing(Person::getAge));
		System.out.println(opt);
		
		// Streams can't reuse
		Optional<Person> opt2= stream.max(Comparator.comparing(Person::getAge));
		System.out.println(opt2);
		
		
		Map<Integer, List<String>> map = persons.stream()
				.collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getFirstName, Collectors.toList()))

		);

		System.out.println(map);
		Map<Integer, Set<String>> map1 = persons.stream()
				.collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getLastName, Collectors.toCollection(TreeSet::new)))

		);
		
		Map<Integer,String> map2 = persons.stream()
				.collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getLastName, Collectors.joining(",")))

		);
		
		Collector<Person, StringJoiner, String> personNameCollector =
			    Collector.of(
			        () -> new StringJoiner(" | "),          // supplier
			        (j, p) -> j.add(p.getLastName().toUpperCase()),  // accumulator
			        (j1, j2) -> j1.merge(j2),               // combiner
			        StringJoiner::toString);                // finisher

			String names = persons
			    .stream()
			    .collect(personNameCollector);

			System.out.println(names);
	}

}
*/