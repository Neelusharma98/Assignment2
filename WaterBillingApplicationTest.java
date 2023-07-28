package currencyapplication;
import java.util.Scanner;

public class WaterBillingApplicationTest {
		public static void main(String[] args) {			
			int unit;	
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter consumed unit");

			unit = scanner.nextInt();
			
			int bill=0, meter_charge = 75;
			
			
			if(unit<=100)
			{
				bill=unit*5;
				
			}
			
			else if(unit<=250)
			{
				bill= 10*unit;
			}
			
			else
			{
				bill=unit*20;
			}
			bill= bill + meter_charge;
			System.out.print("Total water will is "+ bill);
		}

}
