package lab6;

import java.awt.Color;
import sedgewick.StdDraw;

public class Triangles {
	/**
	 * this method is to draw the triangles
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param size the length of the triangle
	 */
	public static void DrawTri (double x, double y, double size){
		// set break condition
		if (size < 0.1)
			return;

		// Draw the lower left triangle
		StdDraw.setPenColor(Color.WHITE);
		double[] x1 = { x + 2 * size/8, x + size * 3/8, x + size/8};
		double[] y1 = { y, y + Math.sqrt(3)/8 * size, y + Math.sqrt(3)/8 * size};
		StdDraw.filledPolygon(x1, y1);

		// Draw the lower right triangle
		StdDraw.setPenColor(Color.WHITE);
		double[] x2 = { x + 6 * size/8, x + 7 * size/8, x + size * 5/8};
		double[] y2 = { y, y + Math.sqrt(3)/8 * size, y + Math.sqrt(3)/8 * size};
		StdDraw.filledPolygon(x2, y2);

		// Draw the top triangle
		StdDraw.setPenColor(Color.WHITE);
		double[] x3 = { x + size * 4/8, x + 5 * size/8, x + size * 3/8};
		double[] y3 = { y + Math.sqrt(3)/4 * size, y + 3 * Math.sqrt(3)/8 * size, y + 3 * Math.sqrt(3)/8 * size};
		StdDraw.filledPolygon(x3, y3);

		// Draw the middle white triangle
		StdDraw.setPenColor(Color.WHITE);
		double[] x4 = { x + size/2, x + 3 * size/4, x + size * 1/4};
		double[] y4 = { y, y + Math.sqrt(3)/4 * size, y + Math.sqrt(3)/4 * size};
		StdDraw.filledPolygon(x4, y4);

		// Pause and show the graph
		StdDraw.pause(100);

		// Recurrence
		DrawTri(x, y, size/2);
		DrawTri(x + size/4, y + Math.sqrt(3)/4 * size, size/2);
		DrawTri(x + size/2, y, size/2);
	}

	public static void main(String[] args) {
		// Draw the black background triangle
		StdDraw.setPenColor(Color.BLACK);
		double[] x_background = {0, 1, 1.0/2};
		double[] y_background = {0, 0, Math.sqrt(3)/2};
		StdDraw.filledPolygon(x_background, y_background);

		// Draw the middle white triangle
		StdDraw.setPenColor(Color.WHITE);
		double[] x_inner = {1.0/2, 3.0/4, 1.0/4};
		double[] y_inner = {0, Math.sqrt(3)/4, Math.sqrt(3)/4};
		StdDraw.filledPolygon(x_inner, y_inner);

		// call the Draw Triangles function
		DrawTri(0,0,1);
	}
}