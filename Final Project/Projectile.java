package project;
public class Projectile {

	private double x;
	private double y;
	private double radius = 0.005;
	
	/**
	 * default constructor
	 */
	public Projectile() {
		
	}
	
	/**
	 * constructor for projectile
	 * @param x x coordinate
	 * @param y y coordinate
	 */
	public Projectile(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * check if two objects are equal
	 */
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null){
			return false;
		}
		if(obj instanceof Projectile){
			Projectile pro = (Projectile) obj;
			return pro.getX() == x && pro.getY() == y;
		}
		return false;
	}
	
	/**
	 * get the x coordinate
	 * @return x coordinate
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * set the x coordinate
	 * @return new x coordinate
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * get the y coordinate
	 * @return y coordinate
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * set the x coordinate
	 * @return new x coordinate
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * get the radius
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * set the radius
	 * @return the new radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}	
}
