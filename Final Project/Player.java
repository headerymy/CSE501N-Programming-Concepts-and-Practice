package project;

import sedgewick.StdDraw;

public class Player implements PlayerInterface {
	
	private double x;
	private double y;
	private double width;
	private double height;

	/**
	 * constructor of player
	 * @param x	x coordinate
	 * @param y	y coordinate
	 * @param width width of  player
	 * @param height height of player
	 */
	public Player(double x, double y, double width, double height) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	/**
	 * override the method in the interface
	 * this method is used to draw the player
	 */
	public void draw(){
		StdDraw.rectangle(x, y, width/2, height/2);
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
}
