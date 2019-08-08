package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2,4,8,9,8,9,5);
		//List<Integer> list1 = Arrays.asList(2,4);
		List<Integer> list3 = Arrays.asList();
		List<Integer> list2 = Arrays.asList(20,30);
		Integer reduced= list1.stream()
							.reduce(0, Integer::sum);
		System.out.println("Reduced:   "+reduced);
		
		Optional<Integer> reduce= list2.stream()
				.reduce(Integer::max);
			System.out.println("Reduced:   "+reduce);
			
			Optional<Integer> reduce2= list3.stream()
					.reduce(Integer::max);
				System.out.println("Reduced:   "+reduce2);
		
					
	}

}
