public class FoundFriend3 implements FriendState
{

	Friend friend;
	
	public FoundFriend3(Friend newFriend)
	{
		friend = newFriend;
	}
	
	@Override
	public void collectfriend1() 
	{
		System.out.println("Your Ostrich friend ran ahead to find the exit.\nYou meet a scared but energetic Kangaroo.");
	}

	@Override
	public void collectfriend2() 
	{
		System.out.println("Your Ostrich friend ran ahead to find the exit.\nYou meet a foolish and unaware Panda.");	
	}

	@Override
	public void collectfriend3() 
	{
		
	}

	@Override
	public void losefriend() 
	{
		System.out.println("Your Ostrich friend was attacked and immobilised.");
	}
}

