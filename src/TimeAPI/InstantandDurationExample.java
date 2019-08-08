package TimeAPI;

import java.time.Duration;
import java.time.Instant;

public class InstantandDurationExample{
	public static void main(String[] args) {
		
		Instant start = Instant.now();  
		System.out.println(start);
		
		Instant end = Instant.now();
		System.out.println(end);
		
		//Duration is amount of time between two instant
		Duration elapsed =Duration.between(start, end);
		System.out.println(elapsed);
		long millis = elapsed.toMillis();
		System.out.println(millis);
	}

}
