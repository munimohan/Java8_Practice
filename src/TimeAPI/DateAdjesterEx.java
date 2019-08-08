package TimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateAdjesterEx {
	public static void main(String[] args) {
		
		LocalDate now= LocalDate.now();
		
		//TemporalAdjusters :: useful to add or subtract an amount of time to an instatnt or LocalDate.
		LocalDate nxtSunday= now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println("Next Sunday is ::"+nxtSunday);
		
	}

}
