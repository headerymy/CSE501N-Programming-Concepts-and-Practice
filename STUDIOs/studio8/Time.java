package studio8;

public class Time implements Working{
	private final int hour, minute;
	private final boolean is12Format;
	
	/**
	 * constructor
	 * @param hour
	 * @param minute
	 * @param is12Format
	 */
	public Time(int hour, int minute, boolean is12Format) {
		this.hour = hour;
		this.minute = minute;
		this.is12Format = is12Format;
	}

	@Override
	/**
	 * to string method
	 */
	public String toString() {
		if (this.is12Format && this.hour <= 12)
			return "The time " + hour + ":" + minute + " A.M.";
		else if(this.is12Format && this.hour > 12)
			return "The time " + (hour - 12) + ":" + minute + " P.M.";
		else
			return "The time " + hour + ":" + minute;
	}

	@Override
	/**
	 * check if equals
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		return result;
	}

	@Override
	/**
	 * check if equals
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}

	/**
	 * check if this time is earlier then the other time
	 * @param other
	 * @return
	 */
	public boolean isEarlierThan(Time other) {
		if (this.hour < other.hour)
			return true;
		else if (this.hour == other.hour && this.minute < other.minute)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Time time = new Time(24, 04, new Boolean(true));
		System.out.println(time);
	}

	@Override
	/**
	 * check working time
	 */
	public boolean amWorking() {
		if (this.hour >= 9 && this.hour <= 17)
			return true;
		return false;
	}

}
