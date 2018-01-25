package studio7;

public class Complex {

	private final double real, imaginary;

	public Complex (double realPart, double imaginaryPart) {
		this.real = realPart;
		this.imaginary = imaginaryPart;
	}

	public String add(Complex c) {
		return (real + c.real) + " + " + (imaginary + c.imaginary) + "i";
	}

	public String multiply(Complex c) {
		return ((real * c.real) - (imaginary * c.imaginary)) + " + " + ((real * c.imaginary) + (imaginary * c.real)) + "i";
	}
	
	public String toString() {
		String str = "";
		Complex c = new Complex(3,4);
		str += "The complex is: " + real + " + " + imaginary + "i" + '\n';
		str += "Another complex is: " + c.real + " + " + c.imaginary + "i" + '\n';
		str += "The sum is: " + add(c) + '\n';
		str += "The product is: " +  multiply(c) + '\n';
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex complex = new Complex(6,2);
		System.out.println(complex);
	}

}
