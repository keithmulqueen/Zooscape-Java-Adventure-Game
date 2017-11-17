public class NoFriend implements FriendState
{

	Friend friend;
	
	public NoFriend(Friend newFriend)
	{
		friend = newFriend;
	}
	
	@Override
	public void collectfriend1() 
	{
		System.out.println("You meet a scared but energetic Kangaroo.");
	}

	@Override
	public void collectfriend2() 
	{
		System.out.println("You meet a foolish and unaware Panda.");	
	}

	@Override
	public void collectfriend3() 
	{
		System.out.println("You meet a quick and fearless Ostrich.");
	}

	@Override
	public void losefriend() 
	{
		
	}
}