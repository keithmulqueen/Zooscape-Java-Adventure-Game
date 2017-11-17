public class heavyWind extends LocationDecorator 
{
	    public heavyWind(Location newLoc) 
	    {
	         super(newLoc);
	    }
	     
	     
	    public String getDescription()
	    {	         
	        return tempLoc.getDescription() + "Strong Winds. ";	         
	    }
	     
	    public double getSpeed()
	    {
	        return tempLoc.getSpeed() - 10.0;	         
	    }
	     
	}
