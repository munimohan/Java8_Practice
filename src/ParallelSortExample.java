
import java.util.Arrays;
import java.util.Random;

public class ParallelSortExample {

	final static int ARRAY_SIZE = 2000000;

	public static void main(String[] args) {

		int[] array1 = new int[ARRAY_SIZE];
		int[] array2 = new int[ARRAY_SIZE];
		Random random = new Random();
		for (int count = 0; count < ARRAY_SIZE; count++) {
			array1[count] = random.nextInt(100 - 1 + 1) + 1;
		}
		array2 = Arrays.copyOf(array1, array1.length);

		System.out.println("*** Sort using array Array.sort() method ***");

		long start = System.currentTimeMillis();
		Arrays.sort(array1);
		long end = System.currentTimeMillis();
		System.out.println("Using  Sort Required Time: " + (end - start));
		
		System.out.println("*** Sort using array Array.parallelSort() method ***");
	    start = System.currentTimeMillis();
		Arrays.parallelSort(array2);
		end = System.currentTimeMillis();
		System.out.println("Using Parallel Sort Required Time: " + (end - start));
	}
}