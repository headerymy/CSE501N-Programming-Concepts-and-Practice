package lab6;

import cse131.ArgsProcessor;

public class Methods {
	/**
	 * calculate the result
	 * @param n initial number
	 * @return output
	 */
	/*
	public static int function1(int n) {
		if (n > 100)
			return (n - 10);
		else
			return function1(function1(n + 11));
	}
	*/
	
	/**
	 * calculate the result
	 * @param x initial number
	 * @param y initial number
	 * @return output
	 */
	
	public static int function2(int x, int y) {
		if (x == 0)
			return y + 1;
		else if (y == 0)
			return function2(x - 1, 1);
		else
			return function2(x - 1, function2(x, y - 1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArgsProcessor ap = new ArgsProcessor(args);
		//int n = ap.nextInt("n");
		//System.out.println(function1(n));
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("x");
		int y = ap.nextInt("y");
		System.out.println(function2(x, y));
	}

}