import java.util.Random;

public class enemyFactory 
{
	public static enemy makeEnemy()
	{

		Random rand = new Random();
		int enemyChoice = rand.nextInt(5);
		
		if(enemyChoice == 0)
		{
			return new lion();
		}
		
		else if(enemyChoice == 1)
		{
			return new gorilla();
		}
		
		else if(enemyChoice == 2)
		{
			return new crocodile();
		}
		
		else if(enemyChoice == 3)
		{
			return new boaConstrictor();
		}
		
		else if(enemyChoice == 4)
		{
			return new cobra();
		}
		
		else
		{
			return null;
		}
	}
}
