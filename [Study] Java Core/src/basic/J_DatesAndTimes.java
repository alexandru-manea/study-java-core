package basic;

public class J_DatesAndTimes {

	/**
	 * NEW API IN JAVA 8
	 * -----------------
	 * 
	 * - In Java 8, dates and times are completely changed
	 * - You can find them now in java.time.*
	 * 
	 * - Basic classes (no public constructors, only use static methods)
	 * 		1. LocalDate	 :: contains just a date. No time or time zone. e.g., birthday
	 * 			static LocalDate of(year, month, dayOfMonth)
	 *  	2. LocalTime     :: contains just a time. No date or time zone. e.g., midnight
	 *  		static LocalTime of(hour, minute [, second, nanos])
	 *  	3. LocalDateTime :: contains date + time. No time zone. e.g. midnight on New Year's
	 *  		static LocalDateTime of(year, month, day, hour, minute) & many other combinations 
	 * 		
	 * - Manipulating dates and times
	 * 	IMP> Date and time classes are IMMUTABLE. So always assign results to a variable
	 * 	e.g.
	 * 		- LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
	 * 		  date.plusDays(2);
	 * 		  date.plusWeeks(2)
	 * 		  ...
	 * 
	 * - Converting LocalDates and LocalDateTimes to long
	 * 		LocalDate.toEpochDay();
	 * 		LocalDateTime.toEpochTime(); 
	 * 
	 * - Using Periods & Durations
	 * 		Period period = Period.ofYears(nr)/ofMonths(nr)...
	 * 		localDate.plus(period)
	 * 		-- Durations intended for smaller units of time
	 * 
	 * - Formatting dates and times
	 * 	- Can get various data out of them with methods such as getDayOfWeek() or getMonth()
	 * 	- DateTimeFormatter in java.time.format cand be used for printing
	 * 		- Can format to a specific standard
	 * 			e.g., date.format(DateTimeFormatter.ISO_LOCAL_DATE);
	 * 		- Can use predefined formats that are more useful
	 * 			e.g., DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
	 * 			
	 * - Parsing dates and times
	 *		DateTimeFormatter formatter = DateTimeFormatter.ofPatters("MM dd yyy");
	 *		LocalDate.parse("01 02 2015", formatter); 
	 * 
	 */
}