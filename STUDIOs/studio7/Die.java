package studio7;

public class Die {
	
	private final int n;
	/**
	 * 
	 * @param n
	 */
	public Die (int n) {
		this.n = n;
	}
	/**
	 * 
	 * @return
	 */
	public int randomGenerator() {
		double randNumber = Math.random();
		double d = randNumber * n;
		int randomInt = (int)d + 1;
		return randomInt;
	}
	/**
	 * 
	 */
	public String toString() {
		return "The random number is " + randomGenerator();
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die = new Die(20);
		System.out.println(die);
	}

}
