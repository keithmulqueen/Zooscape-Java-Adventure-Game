public class boaConstrictor extends enemy
{
	private int amtDamage;
	private int damageDone;
	
	public boaConstrictor()
	{
		setName("Boa Constrictor");
		setDamage(15);
		setEnemyHealth(130);
	}
	
	public int enemySqueeze()
	{
		damageDone = rand.nextInt(amtDamage);
		
		System.out.println("The " +getName() + " Squeezes The Player Tightly.\nDamage Done: " +damageDone+ "\n");
		return damageDone;
	}

}
