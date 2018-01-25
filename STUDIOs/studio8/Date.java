package studio8;

public class Date implements Working{
	
	private final int month, day, year;
	private final boolean isHoliday;
	
	/**
	 * constructor
	 * @param month
	 * @param day
	 * @param year
	 * @param isHoliday
	 */
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	
	@Override
	/**
	 * to string method
	 */
	public String toString() {
		if (this.isHoliday)
			return "The date is " + month + "/" + day + "/" + year + ". It is a Holiday";
		return "The date is " + month + "/" + day + "/" + year + ". It is NOT a Holiday";
	}

	@Override
	/**
	 * hashcode: check if equals
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	/**
	 * equals: check if equals
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	/**
	 * check if this time is earlier then the other time
	 * @param other
	 * @return
	 */
	public boolean isEarlierThan(Date other) {
		if (this.year < other.year)
			return true;
		else if (this.year == other.year && this.month < other.month)
			return true;
		else if (this.year == other.year && this.month == other.month && this.day < other.day)
			return true;
		return false;
	}
	
	/**
	 */
	public static void main(String[] args) {
		Date date = new Date(12, 4, 1993, new Boolean(true));
		Date date1 = new Date(12, 4, 1983, new Boolean(true));
		System.out.println(date);
	}

	@Override
	/**
	 * check working time
	 */
	public boolean amWorking() {
		if (this.day % 2 == 0)
			return true;
		return false;
	}

}
