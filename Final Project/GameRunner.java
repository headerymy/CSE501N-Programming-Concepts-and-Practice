package project;

import java.util.Random;
import cse131.ArgsProcessor;
import sedgewick.StdDraw;


// main method to run the game.
public class GameRunner {	
	public static void main(String[] args) {
		while(true) {		
			ArgsProcessor ap = new ArgsProcessor(args);	
			GameBoard gameBoard = new GameBoard();
			while(!gameBoard.isGameFlag()){
				int angle = ap.nextInt("input angle: ");
				int velocity = ap.nextInt("input velocity: ");
				gameBoard.fireProjectile(angle, velocity);
			}
			StdDraw.pause(3000);
		}
	}
}