package lab1;

import cse131.ArgsProcessor;

public class Nutrition {
	public static void main(String args[]){
		ArgsProcessor ap = new ArgsProcessor(args);
		
		String name = ap.nextString("Enter the name: ");
		double carbs = ap.nextDouble("Enter the mount of carbs: ");
		double fat = ap.nextDouble("Enter the mount of fat: ");
		double protein = ap.nextDouble("Enter the mount of protein: ");
		int statedCals = ap.nextInt("Enter the mount of stated cals: ");;
		
		double extracal = Double.parseDouble(new java.text.DecimalFormat("0.0").format(4 * carbs + 9 * fat + 4 * protein - statedCals));
		double fiber = extracal/4.0;
		
		boolean low_carb = (4 * carbs)/statedCals * 100.0 < 25;
		boolean low_fat = (9 * fat)/statedCals * 100.0 < 15;
		boolean coin_flip = Math.random() > 0.5;
		
		System.out.println(name + " has");
		System.out.println(carbs + " grams of carbonhydrates = " + 4 * carbs + " Calories");
		System.out.println(fat + " grams of fat = " + Math.round(9 * fat * 100)/100.0 + " Calories");
		System.out.println(protein + " grams of protein = " + 4 * protein + " Calories" + "\n");
		
		System.out.println("This food is said to have " + statedCals + " (available) Calories");
		System.out.println("With " + extracal + " unavailable Calories, this food has " + fiber + " grams of fiber" + "\n");
		
		System.out.println("proximately");
		System.out.println(Math.round((4 * carbs)/statedCals * 100 * 100)/100.0 + "% of your food is carbonhydrates");
		System.out.println(Math.round((9 * fat)/statedCals * 100 * 100)/100.0 + "% of your food is fat");
		System.out.println(Math.round((4 * protein)/statedCals * 100 * 100)/100.0 + "% of your food is proteins" + "\n");
		
		System.out.println("This food is acceptable for a low-carb diet? " + low_carb);
		System.out.println("This food is acceptable for a low-fat diet? "+ low_fat);
		System.out.println("By coin flip, you should eat this food? "+ coin_flip);
		
		
	}

}
