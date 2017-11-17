public class boaConstrictorAdapter implements snake 
{
	int damage;
	boaConstrictor boa = new boaConstrictor();

	public boaConstrictorAdapter(boaConstrictor newBoa)
	{
		boa = newBoa;
	}

	@Override
	public int enemyAttacks() 
	{
		damage = boa.enemySqueeze();
		return damage;
	}

	
}
