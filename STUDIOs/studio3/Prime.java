package studio3;

import cse131.ArgsProcessor;

public class Prime {
	public void findprime(){
		int[] array = new int[50];
		for (int k = 0; k < 48; k++){
			array[k] = k + 2;
		}
		
		int index = 2;
		for (int m = 0; m < array.length; m++){
			for (int j = index - 1; j < array.length; j++){
				if (array[j] % index == 0)
					array[j] = 0;
			}
		
			for (int i = index - 1; i < array.length; i++){
				if( array[i] != 0){
					index = array[i];
					break;
				}
			}
		}
		
		for (int l = 0; l < array.length; l++){
			if (array[l] != 0)
				System.out.print(array[l] +" ");
		}
	}

		

	public static void main(String[] args) {
		Prime prime = new Prime();
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("Please input n: ");
		System.out.print("under " + n + " = ");
		prime.findprime();
	}
}