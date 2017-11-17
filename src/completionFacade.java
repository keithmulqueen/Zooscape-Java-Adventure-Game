public class completionFacade 
{
	Completion endmessage;
	MotherCheck mommy;
	CompletionCheck checky;
	
	double distanceToGo;
	boolean motherFound;
	
	public completionFacade(double go, boolean mom)
	{
		distanceToGo = go;
		motherFound = mom;
		
		mommy = new MotherCheck();
		checky = new CompletionCheck();
	}
	
	public boolean getMotherFound()
	{
		return motherFound;
	}
	
	public double getCompletion()
	{
		return distanceToGo;
	}
	
	public boolean completionCheck()
	{
		if(mommy.motherFound(motherFound) && checky.isComplete(distanceToGo))
		{
			endmessage = new Completion();
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
}
