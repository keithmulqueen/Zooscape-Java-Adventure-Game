import java.util.Random;

public abstract class enemy 
{
	private String name;
	private int enemyHealth;
	private int amtDamage;
	private int damageDone;
	
	Random rand = new Random();
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public int getDamage()
	{
		return amtDamage;
	}
	
	public void setDamage(int newDamage)
	{
		amtDamage = newDamage;
	}
	
	public int getEnemyHealth()
	{
		return enemyHealth;
	}
	
	public void setEnemyHealth(int newEnemyHealth)
	{
		enemyHealth = newEnemyHealth;
	}
	
	public void appearDisplay()
	{
		System.out.println("An Angry " +getName() + " Appears and Approaches the Player.");
	}
	
	public int enemyAttacks()
	{
		damageDone = rand.nextInt(amtDamage);
		
		System.out.println("The " +getName() + " Attacks the Player.\nDamage Done: " +damageDone+ "\n");
		return damageDone;
	}
	
}
