package studio1;

import cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Enter the first name: ");
		String s1 = ap.nextString("Enter the second name:");
		String s2 = ap.nextString("Enter the third name:");
		String s3 = ap.nextString("Enter the fourth name:");
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.println("Greetings " + s0 + ", " + s1 + ", " + s2 + ", " + s3 +".");

	}
}
