package lab5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public final class DateRange {
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	public DateRange(LocalDateTime startDate, LocalDateTime endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public boolean isInRange(LocalDateTime date)
	{
		if (this.startDate.compareTo(date) < 0 && this.endDate.compareTo(date) > 0)
			return true;
		return false;
	}
	
	public String toString()
	{
		return startDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))+" - "+endDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
	}
	
	public static LocalDateTime getFirstDayOfMonth(LocalDateTime date)
	{
		YearMonth ym = YearMonth.from(date);
		LocalDate returnDate = ym.atDay(1);
		
		return returnDate.atStartOfDay();
	}
	
	public static LocalDateTime getLastDayOfMonth(LocalDateTime date)
	{
		YearMonth ym = YearMonth.from(date);
		LocalDate returnDate = ym.atEndOfMonth();
		
		return returnDate.atStartOfDay();
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

}
