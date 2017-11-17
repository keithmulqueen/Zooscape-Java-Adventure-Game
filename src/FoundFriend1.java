public class FoundFriend1 implements FriendState 
{

	Friend friend;
	
	public FoundFriend1(Friend newFriend)
	{
		friend = newFriend;
	}
	
	@Override
	public void collectfriend1() 
	{

	}

	@Override
	public void collectfriend2() 
	{
		System.out.println("You're Kangaroo friend leaped over dangerous rubble to escape.\nYou meet a foolish and unaware Panda.");
	}

	@Override
	public void collectfriend3() 
	{
		System.out.println("You're Kangaroo friend leaped over dangerous rubble to escape.\nYou meet a quick and fearless Ostrich.");
	}

	@Override
	public void losefriend() 
	{
		System.out.println("You're Kangaroo friend was startled by the conflict and ran.");
	}
}