package lab4;

import cse131.ArgsProcessor;
import sedgewick.*;

public class BumpingBalls {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor (args);
		int numBalls = ap.nextInt("Please enter the number of balls: ");
		int rounds = ap.nextInt("Please enter the number of rounds: ");

		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);

		double [] vx = new double [numBalls];
		double [] vy = new double [numBalls];
		double [] rx = new double [numBalls];
		double [] ry = new double [numBalls];
		double radnus = 0.05;

		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.filledSquare(0, 0, 1.0);

		for (int n = 0; n < numBalls; n++){
			vx [n] = Math.random()/40;
			vy [n] = Math.random()/40;
			rx [n] = 2 * Math.random() - 1;
			ry [n] = 2 * Math.random() - 1;
		}


		while (true) {     
			for (int n = 0; n < numBalls; n++){
				if (Math.abs(rx[n] + vx[n]) > 1.0 - radnus){ 
					vx[n] = -vx[n];}
				if (Math.abs(ry[n] + vy[n]) > 1.0 - radnus){
					vy[n] = -vy[n];}

				rx[n] += vx[n];
				ry[n] += vy[n];

				for (int m = n; m < numBalls; m++){
					double distance = Math.sqrt(Math.pow(rx[m] - rx[n], 2) + Math.pow(ry[m] - ry[n], 2));

					if (distance < radnus * 2) {
						vx[n] = -vx[n];
						vy[n] = -vy[n];
						vx[m] = -vx[m];
						vy[m] = -vy[m];
					}
				}

			}
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(0, 0, 1.0);

			for (int n = 0; n < numBalls; n++){
				StdDraw.setPenColor(StdDraw.BLACK); 
				StdDraw.filledCircle(rx[n], ry[n], radnus); 
			}

			StdDraw.show(rounds); 
		}
	}
}