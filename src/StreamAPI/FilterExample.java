package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FilterExample {
   public static void main(String[] args) {
	   
List list = new ArrayList<>();


	List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
		
	//Creating the stream of all names
	Stream<String> allNames = names.stream();
		
	//Creating another stream by filtering long names using filter()
	Stream<String> longNames = allNames.filter(str -> str.length() > 6);
		
	//displaying the long names
	longNames.forEach(str->System.out.print(str+" "));
	
	// filter with multiple Conditions
    List<String> longnames = names.stream()  
            .filter(str -> str.length() > 6 && str.length() < 8) //Multiple conditions
            .collect(Collectors.toList());  

    longnames.forEach(System.out::println); 
  }
}