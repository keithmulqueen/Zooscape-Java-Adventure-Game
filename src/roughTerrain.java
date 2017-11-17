public class roughTerrain extends LocationDecorator 
{
	    public roughTerrain(Location newLoc) 
	    {
	         super(newLoc);
	    }
	     
	    public String getDescription()
	    {	         
	        return tempLoc.getDescription() + "Rough Flooring. ";	         
	    }
	     
	    public double getSpeed()
	    {
	        return tempLoc.getSpeed() - 10.0;	         
	    }
	     
	}

