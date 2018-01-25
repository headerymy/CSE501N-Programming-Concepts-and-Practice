package studio7;

public class Rectangle {
	
	private final double length, width;
	
	/**
	 * 
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	/**
	 * 
	 * @return
	 */
	public double area() {
		return length * width;
	}
	
	/**
	 * 
	 * @return
	 */
	public double perimeter() {
		return 2 * (length + width);
	}
	
	/**
	 * 
	 * @param rectangle
	 * @return
	 */
	public String compare(Rectangle rectangle) {
		if (area() < rectangle.area())
			return "This rectangle is smaller";
		return "This rectangle is bigger";
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isSquare() {
		if (length == width)
			return true;
		return false;
	}
	
	/**
	 * 
	 */
	public String toString() {
		String str = "";
		str += "The area of this rectangle is " + area() + '\n';
		str += "The perimeter of this rectangle is " + perimeter() + '\n';
		str += "Is this rectangle a square?\n\t" + isSquare() + '\n';
		str += "Is this rectangle bigger or smaller than the new one?\n\t" + compare(new Rectangle(8, 5));
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(10, 5);
		System.out.println(rectangle);		
	}

}
