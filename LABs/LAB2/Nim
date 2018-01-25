package lab2;

import cse131.ArgsProcessor;

public class Nim
{
       
    public static void main(String[] args)
    {
    	ArgsProcessor ap = new ArgsProcessor(args);
        int left = ap.nextInt("Enter number of elements to start.");
        int round = -1;
        
        boolean bool = false;
        String str = ap.nextString("Enter the first to start: human or computer.");
       
        while((!str.equalsIgnoreCase("human")) && (!str.equalsIgnoreCase("computer")))
        {
            str=ap.nextString(str+" not allowed, choose HumanMove or computer.");
        }
        
        switch(str){
        	case "humane":
        		bool = false;
        		break;
        	case "computer":
        		bool = true;
        		break;        	
        }
               
        while(left > 0)        	
        {
        	if (bool){
        		while(left > 0)        	
        		{
        			round++;
        			int tmp = left;
        			int ComputerMove = (int)(Math.random()*2)+1;            
        			left -= ComputerMove;
        			int tmp2 = left;
        			System.out.println("Round " + round + ", " + tmp + " sticks at start" + ", computer took " + ComputerMove + ", so " + left + " sticks remain.");
        			if(left <= 0)
        			{
        				System.out.println("Computer wins!");
        				break;
        			}
        			System.out.println("Please enter your move? (1 or 2)");
        			int HumanMove = ap.nextInt();
        			while(HumanMove != 1 && HumanMove != 2)
        			{
        				System.out.println(HumanMove+" not allowed, choose 1 or 2.");
        				HumanMove = ap.nextInt();
        			}
        			left -= HumanMove;                
        			round++;
        			System.out.println("Round " + round + ", " + tmp2 + " sticks at start" + ", Human took " + HumanMove + ", so " + left + " sticks remain.");
        			if(left <= 0)
        			{
        				System.out.println("Human win!");
        				break;
        			}
        		}
        }
        
        	else{
        		while(left>0)        	
        		{
        			round++;
        			int tmp = left;
            	
        			int HumanMove = ap.nextInt("Please enter your move? (1 or 2)");
        			while(HumanMove != 1 && HumanMove != 2)
        			{
        				HumanMove = ap.nextInt(HumanMove + " not allowed, choose 1 or 2.");
        			}	
        			left -= HumanMove;
        			System.out.println("Round " + round + ", " + tmp + " sticks at start" + ", Human took " + HumanMove + ", so " + left + " sticks remain.");
                         
        			
        			
        			if(left<=0)
        			{
        				System.out.println("Human wins!");
        				break;
        			}
        			round++;
        			int tmp2 = left;
        			int ComputerMove = (int)(Math.random()*2)+1;
        			left -= ComputerMove;
                
        			System.out.println("Round " + round + ", " + tmp2 + " sticks at start" + ", computer took " + ComputerMove + ", so " + left + " sticks remain.");
                
        			if(left <= 0)
        			{
        				System.out.println("Computer win!");
        				break;
        			}
        		}
        		}
        }
    }
}
