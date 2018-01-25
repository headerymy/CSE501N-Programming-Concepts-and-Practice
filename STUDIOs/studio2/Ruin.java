package studio2;

import cse131.ArgsProcessor;

public class Ruin {

	public static void main(String[] args) {
				
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int tmp = ap.nextInt("Please enter the amount of money that you start with: ");
		int startAmount = tmp;
		double winChance = ap.nextDouble("Please enter the probability that you win a gamble: ");
		int winAmount = ap.nextInt("Please enter the amount of money that you can win with: ");
		int totalPlays = ap.nextInt("Please enter the number of times you simulate the problem: ");
		
		double lossChance = 1 - winChance;
		double Ruin;
		int rounds = 0;
		double wins = 0.0;
		
		if (lossChance != winChance)
			Ruin = (Math.pow(lossChance/winChance, startAmount) - Math.pow(lossChance/winChance, winAmount)) / (1 - Math.pow(lossChance/winChance, winAmount));
		else
			Ruin = 1 - startAmount / winAmount;
						
		for (int i = 1; i < totalPlays + 1; i++){
			boolean win_lose = false;
			startAmount = tmp;
			while (startAmount > 0 && startAmount < winAmount){
				rounds++;  				
				double ran = Math.random();
				if ( ran < winChance )
					startAmount += 1;
				else 
					startAmount -= 1;
			}
			
			if (startAmount == winAmount){
				wins++;
				win_lose = true;
			}
			
			System.out.println("Simulation " + i + ": " + rounds + " rounds \t" + ((win_lose) ? "WIN" : "LOSE"));
			
		}
		
		System.out.println("\nLosses: " + (int)(totalPlays - wins) + "  Simulations: " + totalPlays);
		System.out.println("Actual Ruin Rate: " + ((totalPlays - wins)/totalPlays) +  " Expected Ruin Rate: " + Ruin);
			
	}

}
