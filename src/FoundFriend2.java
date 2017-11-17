public class FoundFriend2 implements FriendState
{

	Friend friend;
	
	public FoundFriend2(Friend newFriend)
	{
		friend = newFriend;
	}
	
	@Override
	public void collectfriend1() 
	{
		System.out.println("Your Panda friend has escaped by climbing a tall tree.\nYou meet a scared but energetic Kangaroo.");
	}

	@Override
	public void collectfriend2() 
	{
			
	}

	@Override
	public void collectfriend3() 
	{
		System.out.println("Your Panda friend has escaped by climbing a tall tree.\nYou meet a quick and fearless Ostrich.");
	}

	@Override
	public void losefriend() 
	{
		System.out.println("Your Panda friend got distacted and lost.");
	}
}