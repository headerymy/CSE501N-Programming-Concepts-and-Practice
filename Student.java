package lab7;

public class Student {
	final private String firstName, lastName;
	final private int studentID;
	private int credits;
	private double GPA;
	private double qualityScore;
	/**
	 * constructor
	 * @param fN
	 * @param lN
	 * @param id
	 */
	public Student(String fN, String lN, int id) {
		this.firstName = fN;
		this.lastName = lN;
		this.studentID = id;
		this.qualityScore = 0.0;
		this.credits = 0;
		this.GPA = 0.0;

	}
	
	/**
	 * get student ID
	 * @return student ID
	 */
	public int getStudentID() {
		return studentID;
	}
	
	/**
	 * get credit
	 * @return credit
	 */
	public int getCredits() {
		return credits;
	}
	
	/**
	 * get GPA
	 * @return GPA
	 */
	public double getGPA() {
		return Math.round(GPA * 1000)/1000.0;
	}
	
	/**
	 * get name 
	 * @return name
	 */
	public String getName() {
		return firstName + " " + lastName;
	}
	
	/**
	 * submit the grade
	 * @param grade
	 * @param credit
	 */
	public void submitGrade(double grade, int credit) {
		qualityScore += credit * grade;
		credits += credit;
		GPA = qualityScore/credits;
	}
	
	/**
	 * get class standing 
	 * @return check the standing and return it
	 */
	public String getClassStanding() {
		int credit = credits;
		if (credit < 30) {
			return "Freshman";
		} else if (credit < 60) {
			return"Sophomore";
		} else if (credit < 90) {
			return "Junior";
		} else {
			return "Senior";
		}
	}
	
	/**
	 * create legacy method
	 * @param beloved
	 * @return the legacy
	 */
	public Student createLegacy(Student beloved){
		Student legacy = new Student(this.getName(), beloved.getName(), studentID + beloved.getStudentID());
		
		legacy.GPA = (this.getGPA() + beloved.getGPA())/2;
		if(this.getCredits() > beloved.getCredits()){
			legacy.credits = this.getCredits();
		}else{
			legacy.credits = beloved.getCredits();
		}
		return legacy;
	}
	
	/**
	 * to string method
	 */
	public String toString(){
		return getName() + " " + getStudentID();
	}
}