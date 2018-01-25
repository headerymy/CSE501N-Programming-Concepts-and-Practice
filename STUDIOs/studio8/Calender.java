package studio8;

import java.util.HashSet;

public class Calender {
	
	private final HashSet<Appointment> appointments;
	
	/**
	 * constructor
	 */
	public Calender() {
		this.appointments = new HashSet<Appointment> ();
	}
	
	/**
	 * add appointment
	 * @param a
	 */
	public void addAppointment(Appointment a) {
		appointments.add(a);
	}
	
	@Override
	/**
	 * to string method
	 */
	public String toString() {
		return "Calender [appointments=" + appointments + "]";
	}

	@Override
	/**
	 * check if equals
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appointments == null) ? 0 : appointments.hashCode());
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
		Calender other = (Calender) obj;
		if (appointments == null) {
			if (other.appointments != null)
				return false;
		} else if (!appointments.equals(other.appointments))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
