abstract class LocationDecorator implements Location
{
	protected Location tempLoc;
	
	public LocationDecorator(Location newLoc)
	{
		tempLoc = newLoc;
	}
	     
	public String getDescription() 
	{
	    return tempLoc.getDescription();       
    }
	 
	public double getCost() 
	{
	    return tempLoc.getSpeed();
	}
	     
}

