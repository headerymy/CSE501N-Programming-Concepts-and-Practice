package lab6;

public class Beer {
	/**
	 * this method is used to print the output
	 * @param n number of beer
	 * @return output
	 */
	public static String bottlesOfBeer(int n) {
		String output = Integer.toString(n) + " bottles of beer on the wall, " + Integer.toString(n) + 
				" bottles of beer; you take one down, pass it around, "
				+ Integer.toString(n - 1) + " bottles of beer on the wall.";
		if (n <= 1)
			return "1 bottles of beer on the wall, 1 bottles of beer; "
					+ "you take one down, pass it around, 0 bottles of beer on the wall.";

		return (output + "\n"+ bottlesOfBeer(n - 1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bottlesOfBeer(5));
	}

}
