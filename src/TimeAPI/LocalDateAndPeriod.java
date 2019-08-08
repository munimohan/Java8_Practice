package TimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.text.DateFormatter;

public class LocalDateAndPeriod {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println("Today is "+today );
		
		//LocalDate dateofBirth=LocalDate.of(1986, 06, 29);
		LocalDate dateofBirth=LocalDate.of(1986, Month.JUNE, 29);
		System.out.println("Date Of Birth is :"+dateofBirth);
		
		//Period is time between two different LocalDates.
		
		Period p= dateofBirth.until(today);
		System.out.println("Years :"+p.getYears() );
		
		long months = dateofBirth.until(today, ChronoUnit.MONTHS);
		System.out.println("Months :"+months);
		
		long days = dateofBirth.until(today, ChronoUnit.DAYS);
		System.out.println("Days :"+days);
		
		System.out.println("***************");
		
		LocalDate fromCustomPattern = LocalDate.parse(today.toString(), DateTimeFormatter.ISO_DATE);
		
		System.out.println(fromCustomPattern);
		System.out.println(LocalDate.parse("2019-07-05", DateTimeFormatter.ISO_LOCAL_DATE));
		
		/*LocalDate lowesEffectiveDateLocal = LocalDate.parse(today.toString(), DateTimeFormatter.ofPattern("d-MMM-yyyy"));
		System.out.println(lowesEffectiveDateLocal);
    	//LocalDate sellingCenterEffectiveDateLocal = LocalDate.parse(sellingCenterEffectiveDate, formatter);
    	 * 
    	 *  
*/ 
		
		String test = "testette"+System.lineSeparator()+"example";
		String[] testArray= test.split(System.getProperty("line.separator"));
		
		String dateString="2018-07-31T12:00:00Z";
		System.out.println("Given date is " + dateString);
	    LocalDateTime date = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
	 
	    System.out.println("MM/dd/yyyy formatted date : " + DateTimeFormatter.ofPattern("MM-dd/yyyy").format(date));
	    System.out.println("yyyy-MM-dd formatted date : " + DateTimeFormatter.ofPattern("yyyy-MM-dd").format(date));
		
		

	}

}
