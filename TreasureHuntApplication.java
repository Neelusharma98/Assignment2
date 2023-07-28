package currencyapplication;

import java.util.Scanner;

public class TreasureHuntApplication {
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the tresure island. select  right or left for move");	
		Scanner scanner = new Scanner(System.in);
		String move = scanner.next();
		
		if(move.equalsIgnoreCase("left"))
		{
			System.out.println("select move swim or wait");
			String move2 = scanner.next();
			
			if(move2.equalsIgnoreCase("wait"))
			{
				System.out.println("select a door among  three door Red, Blue, Yellow");
				String door = scanner.next();
				
					
					if(door.equalsIgnoreCase("Red"))
					{
						System.out.println("Burned by fire Game Over.");
					}
					
					else if(door.equalsIgnoreCase("Blue"))
					{
						System.out.println("Eaten bye beats Game Over.");
					}
					
					else if(door.equalsIgnoreCase("Yellow"))
						
					{
						System.out.println(" Congratulation You Win");
					}
					
					else
					{
						System.out.println("-------Game Over------");
				    }
			
		    }
			
			else
			
				System.out.println("Attack by trout Game Over.");
			
       
	}
	
		
		else
			System.out.println("fall into a hole Game Over");
		
		
	}

	

}
