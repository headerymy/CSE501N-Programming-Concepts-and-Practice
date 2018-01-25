package project;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import sedgewick.StdDraw;

public class Ground implements PlayerInterface {
	private double x;
	private double y;
	private double width;
	private double height;	
	private List<Projectile> projectiles = new ArrayList<Projectile>();
	
	/**
	 * constructor for ground
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param width width of ground
	 * @param height height of ground
	 */
	public Ground(double x, double y, double width, double height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	/**
	 * add a projectile
	 * @param projectile
	 */
	public void addPit(Projectile projectile){
		projectiles.add(projectile);
	}
	
	@Override
	/**
	 * override the method in the interface
	 * this method is used to draw the ground
	 */
	public void draw(){
		StdDraw.filledRectangle(x, y, width, height/2);
		for(Projectile projectile : projectiles){
			StdDraw.setPenColor(Color.white);
			StdDraw.filledCircle(projectile.getX(), projectile.getY(), 0.01);
		}
		StdDraw.show();
		StdDraw.setPenColor(Color.black);
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
	 * get the width
	 * @return width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * set the width
	 * @return the new width
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * get the height
	 * @return height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * set the height
	 * @return the new height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * get the project list
	 * @return the list
	 */
	public List<Projectile> getProjectiles() {
		return projectiles;
	}

	/**
	 * set the project list
	 * @param new projectiles
	 */
	public void setProjectiles(List<Projectile> projectiles) {
		this.projectiles = projectiles;
	}
}