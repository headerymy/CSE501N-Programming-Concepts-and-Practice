package studio7;

public class Fraction {

	private final int numerator, denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public String add(Fraction f) {
		int num = numerator * f.denominator + denominator * f.numerator;
		int den = denominator * f.denominator;	
		return num + "/" + den; 
	}

	public String multiply(Fraction f) {
		int num = numerator * f.numerator;
		int den = denominator * f.denominator;		
		return num + "/" + den;
	}
	/**
	 * 
	 * @return
	 */
	public String reciprocal() {
		return denominator + "/" + numerator;
	}
	/**
	 * 
	 * @param f
	 * @return
	 */
	public String simplify(Fraction f) {
		int common = gcd(f.numerator, f.denominator);
		int num = f.numerator/common;
		int den = f.denominator/common;
		return num + "/" + den;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int gcd(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;

		if (a < 0) a = -a;
		if (b < 0) b = -b;

		int answer = 1;
		for (int i=2; i<=a && i<=b; i++) {
			if (a%i == 0 && b%i == 0)
				answer = i;
		}
		return answer;
	}
	/**
	 * 
	 * @return
	 */
	public String toStirng() {
		String str = "";
		Fraction f = new Fraction(2, 6);
		str += "The fraction is: " + numerator + "/" + denominator + '\n';
		str += "The simplied fraction is: " + simplify(new Fraction(numerator, denominator)) + '\n';
		str += "The sum is: " + add(f) + '\n';
		str += "The product is: " +  multiply(f) + '\n';
		str += "The new frqction is: " + reciprocal() + '\n';
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction fraction = new Fraction(2, 4);
		System.out.println(fraction.toStirng());
	}
}
