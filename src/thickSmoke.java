public class thickSmoke extends LocationDecorator 
{
	    public thickSmoke(Location newLoc) 
	    {
	         super(newLoc);
	    }
	      
	    public String getDescription()
	    {	         
	        return tempLoc.getDescription() + "Thick Black Smoke. ";	         
	    }
	     
	    public double getSpeed()
	    {
	        return tempLoc.getSpeed() - 10.0;	         
	    }
	     
	}
