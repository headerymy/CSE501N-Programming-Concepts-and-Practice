package lab3;

import cse131.ArgsProcessor;

public class Dice {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		Dice dices = new Dice();
		int thrownTimes = ap.nextInt("Please enter the how many times you want throw: ");
		int diceNumbers = ap.nextInt("Please enter the how many dices you want for one thrown: ");
		int[][] diceThrown = new int[thrownTimes][diceNumbers];
		
		//This step is used to store all the throws in an 2-d array.
		System.out.println("Dices are shown below: \t\tSum of the dices:");
		for (int t = 0; t < thrownTimes; t++){
			int summ = 0;
			for (int i = 0; i< diceNumbers; i++){
				int dice = (int)(Math.random()*6+1);
				System.out.print(dice + "   ");
				diceThrown[t][i] = dice;
				summ += diceThrown[t][i];
			}
				System.out.print("\t\t\t" + summ);
			System.out.println();
		}
		System.out.println();
		
		//This part is used to count the times that 3 dices have the same number.
		int same = 0;
		for (int a = 0; a < diceThrown.length; a++){
			int subsame = 0;
			for (int b = 1 ; b < diceThrown[a].length; b++)
				if (diceThrown[a][0] == diceThrown[a][b]){
					subsame++;
				}
			if (subsame == (diceNumbers - 1))
				same++;
		}
		double sameDices = (same * 1.0/thrownTimes * 100);
		System.out.println("The percentage that " + diceNumbers + " dices are same is: " + sameDices + "%");
		System.out.println();
		
		//Get the sum number of each thrown.
		int[] sum = new int[thrownTimes];
		System.out.println("Sum\tNumber of times Sum was seen\tThe precentage is ");
		for (int t = 0; t < thrownTimes; t++){
			int sumNumber = 0;
			for (int i = 0; i< diceNumbers; i++){
				sumNumber += diceThrown[t][i];
				sum[t] = sumNumber;
			}
		}
		
		
		//Find the same sum number in the sum array and count the repeated times for each numbers.
		int b[][] = new int[thrownTimes][2];
		int k = 0;
		boolean temp = false;
		for(int i = 0; i < sum.length; i++){
		    for(int j = 0; j < thrownTimes; j++){
		        if(sum[i] == b[j][0]){   
		        	temp = true;
		            b[j][1]++;
		            break;
		        }
		    }
		    if(temp == false){
		        b[k][0] = sum[i];
		        b[k][1] = 1;
		        k++;    
		    }
		    temp = false;
		}
		
		for(int i = 0; i < thrownTimes; i++){
		    for(int j = 0 ;j < 1; j++){
		    	if(b[i][j] != 0)
		    		System.out.println(b[i][j] + "\t \t" + b[i][j+1] + "\t\t\t\t" + Math.round((b[i][j+1] * 1.0 / thrownTimes) * 100) + "%");
		    }
		}
		System.out.println();		
				
	}

}
