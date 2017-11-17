public class Friend 
{   
    FriendState noFriend;
	FriendState gatherFriend1;    
    FriendState gatherFriend2;	    
    FriendState gatherFriend3;
    
    FriendState currentState;

	boolean friend1 = false;
	boolean friend2 = false;
	boolean friend3 = false;
	     
	public Friend()
	{
		noFriend = new NoFriend(this);
		gatherFriend1 = new FoundFriend1(this);
	   	gatherFriend2 = new FoundFriend2(this);
	 	gatherFriend3 = new FoundFriend3(this);

	    currentState = noFriend;
	}

	void setFriendState(FriendState newFriendState)
	{
	     currentState = newFriendState;
	}
   
	public void collectfriend1() 
	{        
	 	currentState.collectfriend1();
	}
	 
	public void collectfriend2() 
	{        
	  	currentState.collectfriend2();
	}
	 
	public void collectfriend3() 
	{        
	 	currentState.collectfriend3();
	}
	
	public void losefriend() 
	{        
		currentState = noFriend;
	}
	 
	public FriendState getNoFriendState() 
	{ 
		return noFriend; 
	}
	
	public FriendState getFriend1State() 
	{ 
		return gatherFriend1; 
	}	    
	
	public FriendState getFriend2State() 
	{ 
		return gatherFriend2; 
	}
	
	public FriendState getFriend3State() 
	{ 
		return gatherFriend3; 
	}
}

