import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class ParallelSorting {
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(7,29,35,2,67,45,24,78,94,56);

		
		//Sequential Sort

		long t00 = System.nanoTime();

		long counts = values.stream().sorted().count();
		System.out.println(counts);

		long t11 = System.nanoTime();

		long millise = TimeUnit.NANOSECONDS.toMillis(t11 - t00);
		System.out.println(String.format("sequential sort took: %d ms", millise));

		// sequential sort took: 899 ms
		//Parallel Sort

		long t0 = System.nanoTime();

		long count = values.parallelStream().sorted().count();
		System.out.println(count);

		long t1 = System.nanoTime();

		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("parallel sort took: %d ms", millis));

		// parallel sort took: 472 ms
		//As you can see both code snippets are almost identical but the parallel sort is roughly 50% faster. All you have to do is change stream() to parallelStream().
	}
	
	
		
	}

	
	