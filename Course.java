package lab7;

public class Course {
	final private String name;
	final private int credits, seats;
	private Student[] roster;
	private int currentEnrolled;
    
	/**
     * constructor
     * @param name
     * @param credit
     * @param seat
     */
	public Course(String name, int credit, int seat) {
		this.name = name;
		this.credits = credit;
		this.seats = seat;
		this.roster = new Student[this.seats];
		this.currentEnrolled = 0;
	}
	
	/**
	 * get the remaining seats method
	 * @return the remaining method
	 */
	public int getRemainingSeats() {
		return seats - currentEnrolled;
	}
	
	/**
	 * get the name
	 * @return the name 
	 */
	public String getName() {
		return name;
	}
	/**
	 * get the roster
	 * @return the string of roster
	 */
	public String generateRoster() {
		String roster = new String();
		for (Student s : this.roster) {
			if (s != null) {
				roster += s.toString() + "\n";
			}
		}
		return roster;
	}
	/**
	 * get the average GPA
	 * @return the average GPA
	 */
	public double averageGPA(){
		double sumGPA = 0;
		for(Student s : this.roster){
			if(s != null){
				sumGPA += s.getGPA();
			}
		}
		return sumGPA/currentEnrolled;
	}
	
	/**
	 * add student
	 * @param s
	 * @return 
	 */
	public boolean addStudent(Student s) {
		if (currentEnrolled < seats) {
			for (int i = 0; i < seats; i++) {
				if (roster[i] == s) {
					return false;
				}
			}
			roster[currentEnrolled] = s;
			currentEnrolled++;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * to string method
	 */
	public String toString(){
		return name + " " + credits;
	}
}