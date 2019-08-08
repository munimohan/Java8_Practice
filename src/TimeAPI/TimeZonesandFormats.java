package TimeAPI;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TimeZonesandFormats {
	public static void main(String[] args) {
		//To get Available Time Zones
		Set availTZ=ZoneId.getAvailableZoneIds();
		System.out.println(availTZ);
		
		ZoneId ukTz = ZoneId.of("Europe/London");
		System.out.println(ukTz);
		
		System.out.println(ZonedDateTime.of(1564,Month.APRIL.getValue(), 23, // Yr, Month, Day
				10, 0, 0, 0,												//h mm ss nanos	
				ZoneId.of("Europe/London")));
		ZonedDateTime nxtmeeting = 	ZonedDateTime.of(
											LocalDate.of(2016,Month.MAY.getValue(), 07 ),
											LocalTime.of(9, 30),
											ZoneId.of("Europe/London"));
		//change the time zone one to another
		ZonedDateTime nxtmeetingUs =nxtmeeting.withZoneSameInstant(ZoneId.of("US/Central"));
		System.out.println(nxtmeetingUs);
		
		displayTimeZone(TimeZone.getTimeZone(ukTz));
		
		// date Formatters
		
		//old
		
		Date date = new Date();
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
		System.out.println(sdf.format(date));
		
	//java 8
		
		System.out.println("**************************************");
		System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(nxtmeetingUs));
		System.out.println(DateTimeFormatter.RFC_1123_DATE_TIME.format(nxtmeeting));
		System.out.println(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(nxtmeeting));
		
		
		
			
		// 2014-04-01 10:45
		LocalDateTime dateTime = LocalDateTime.of(2014, Month.APRIL, 1, 10, 45);
		// format as basic ISO date format (20140220)
		String asBasicIsoDate = dateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
		// format as ISO week date (2014-W08-4)
		String asIsoWeekDate = dateTime.format(DateTimeFormatter.ISO_WEEK_DATE);
		// format ISO date time (2014-02-20T20:04:05.867)
		String asIsoDateTime = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
		// using a custom pattern (01/04/2014)
		String asCustomPattern = dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		// french date formatting (1. avril 2014)
		String frenchDate = dateTime.format(DateTimeFormatter.ofPattern("d. MMMM yyyy", new Locale("fr")));
		// using short german date/time formatting (01.04.14 10:45)
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
		.withLocale(new Locale("de"));
		String germanDateTime = dateTime.format(formatter);
		// parsing date strings
		LocalDate fromIsoDate = LocalDate.parse("2014-01-20");
		LocalDate fromIsoWeekDate = LocalDate.parse("2014-W14-2", DateTimeFormatter.ISO_WEEK_DATE);
		LocalDate fromCustomPattern = LocalDate.parse("20.01.2014", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		
	}
	
	private static String displayTimeZone(TimeZone tz) {

		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
		long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) 
                                  - TimeUnit.HOURS.toMinutes(hours);
		// avoid -4:-30 issue
		minutes = Math.abs(minutes);

		String result = "";
		if (hours > 0) {
			result = String.format("(GMT+%d:%02d) %s", hours, minutes, tz.getID());
		} else {
			result = String.format("(GMT%d:%02d) %s", hours, minutes, tz.getID());
		}

		return result;

	}


}
