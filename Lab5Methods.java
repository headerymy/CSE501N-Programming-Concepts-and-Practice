package lab5;

public class Lab5Methods {
	/**
	 * sum down by 2
	 * @param n Sn
	 * @return the sum from 1 to n
	 */
	public static int sumDownBy2(int n) {
		int sum = 0;
		if (n > 0) {
			while (n > 0) {
				sum = sum + n;
				n = n - 2;
			}
		} else {
			sum = 0;
		}
		return sum;
	}

	/**
	 * harmonic sum
	 * @param n 1/n
	 * @return sum from 1 1/2 .... 1/n
	 */
	public static double harmonicSum(int n) {
		double sum = 0;
		if(n > 0){
			for(int i = 1; i <= n; i++){
				double tmp = i;
				sum = sum + 1.0/tmp;
			}
		}
		return sum;	
	}

	/**
	 * geomertic sum
	 * @param k 1/k^2
	 * @return sum from 1 1/2^2 .... 1/k^2
	 */
	public static double geometricSum(int k) {
		double sum = 0;
		if(k >= 0){
			for(int i = 0; i <= k; i++){
				double tmp = Math.pow(2, i);
				sum = sum + 1.0/tmp;
			}
		}
		return sum;

	}

	/**
	 * multiple two positive numbers
	 * @param j one of two numbers
	 * @param k one of two numbers
	 * @return the sum
	 */
	public static int multPos(int j, int k) {
		int sum = 0;
		for(int i = 0; i < k; i++){
			sum = sum + j;
		}
		return sum;

	}

	/**
	 * multiple two numbers
	 * @param j one of two numbers
	 * @param k one of two numbers
	 * @return the sum
	 */
	public static int mult(int j, int k) {
		int sum = 0;
		if(j >= 0 && k >= 0){
			for(int i = 0; i < k; i++){
				sum = sum + j;
			}
		}
		if (j >= 0 && k < 0){
			for(int i = 0; i < j; i++){
				sum = sum + k;
			}
		}
		if (j < 0 && k < 0){
			for(int i = 0; i > k; i--){
				sum = sum - j;
			}
		}
		if(j < 0 && k >= 0){
			for(int i = 0; i < k; i++){
				sum = sum + j;
			}
		}
		return sum;

	}

	/**
	 * sum of expectation 
	 * @param n n power
	 * @param k 
	 * @return the sum
	 */
	public static int expt(int n, int k) {
		int sum = 1;
		for(int i = 0; i < k; i++){
			sum = sum * n;
		}
		return sum;

	}
}
