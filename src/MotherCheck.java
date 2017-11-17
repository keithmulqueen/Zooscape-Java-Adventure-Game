import java.util.Random;

public class MotherCheck 
{
	private int therand;
	private int chance = 100;
	
	Random rand = new Random();
	
	
	public boolean motherFound(boolean found)
	{
		if(found == true)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public boolean setMotherFound(boolean found)
	{		
		if(found==true)
		{
			return true;
		}
		else
		{
			therand = rand.nextInt(chance);
			
			if(therand<50 && therand>41)
			{
				System.out.println("You have Found your Mother.");
				return true;
			}
			else
			{
				if(therand<20 && therand>0)
				{
					System.out.println("You Continue Looking for Your Mother.");
				}
				else if(therand<40 && therand>21)
				{
					System.out.println("You Have Still Not Found Your Mother.");
				}
				else if(therand<75 && therand>51)
				{
					System.out.println("You Begin to Worry About Your Mother.");
				}
				else
				{
					System.out.println("You Proceed to Search Across the Zoo, Looking for Your Mother.");
				}
				
				return false;
			}
		}
		
	}
	
}