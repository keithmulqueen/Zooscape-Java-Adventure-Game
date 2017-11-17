public class Terrain 
{
	private double location;
	
	public Terrain(double newLocation)
	{
		location = newLocation;
	}
	
	public String getTerrain()
	{
		if(location<=200 && location >=0)
		{
			return "Petting Zoo & Reception Area";
		}
		else if(location<=400 && location >=201)
		{
			return "Asian Rainforrest Zone";
		}
		else if(location<=600 && location >=401)
		{
			return "Oceanic Bridge";
		}
		else if(location<=800 && location >=601)
		{
			return "Austalian Outback Zone";
		}
		else
		{
			return "African Savannah Zone";
		}
		
	}
}
