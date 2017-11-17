import java.util.Scanner;
import java.util.Random;

public class main 
{
	
	public static void main(String[] args)
	{
		
		boolean running = true;
		int health = 100;
		int damage = 60;	
		int foodSnack = 3;			
		int foodRestore = 50;
		int dropRand = 50;
		int enemyHealth;
		int maxEnemyHealth;
		String article;
		int saveFiles = 0 ;
		int currentArticle=0;
		int distanceToGo = 1000;
		boolean motherFound = false;
		String friendName = "Alone";
		
		caretaker caretaker = new caretaker();
		originator originator = new originator();
		
		mainGUI gui = new mainGUI();
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		Friend friend = new Friend();
		Terrain terrain;
		MotherCheck mother;
		Location currentLoc;
			
		
		
	    	
			article = "Memory #"+ (saveFiles+1) +"\n\nIt was late at night when I heard the surroundings around me \ncrumbling. "
					+ "The cages began rattling and all the animals \nhere began crying for help. "
					+ "I wasnt sure where I was \nanymore, but I knew i needed to escape. "
					+ "I know the exit \nisnt far from here, where is my mom? I need to get out of here.";
			
			originator.set(article);
			caretaker.addMemento(originator.save());
			saveFiles++;
			currentArticle++;
			gui.setScreen(article);
			
			System.out.println("The Game Begins.\n\nYour Mother is Missing from Your Cage.");
			
        	while(running == true)
    		{
        		mother = new MotherCheck();
        		mother.setMotherFound(motherFound);
        		
        		
        		if(distanceToGo<=200 && distanceToGo >=0)
        		{
        			currentLoc = new thickSmoke(new heavyWind(new roughTerrain(new UndecoratedLocation())));
        			friend.losefriend();
        			friendName = "Alone";
        		}
        		else if(distanceToGo<=400 && distanceToGo >=201)
        		{
        			currentLoc = new heavyWind(new roughTerrain(new UndecoratedLocation()));
        			friend.collectfriend2();
        			friendName = "Joey the Kangaroo";
        		}
        		else if(distanceToGo<=600 && distanceToGo >=401)
        		{
        			currentLoc = new heavyWind(new UndecoratedLocation());
        			friend.collectfriend3();
        			friendName = "Elle the Ostrich";
        		}
        		else if(distanceToGo<=800 && distanceToGo >=601)
        		{
        			currentLoc = new roughTerrain(new UndecoratedLocation());
        			friend.collectfriend2();
        			friendName = "Marcus the Panda";
        		}
        		else
        		{
        			currentLoc = new thickSmoke(new roughTerrain(new UndecoratedLocation()));
        			friendName = "Alone";
        		}
        		
        		terrain = new Terrain(distanceToGo);

        		if(distanceToGo < 0)
        		{
        			distanceToGo=0;
        		}
        		

	        		System.out.println("\nDistance To Travel: \t" +distanceToGo+ "m");
	        		System.out.println("Player Health: \t\t" +health+ "/100");
	        		System.out.println("Terrain Conditions: \t" + currentLoc.getDescription());
	        		System.out.println("Terrain: \t\t" + terrain.getTerrain());
	        		System.out.println("Speed Travelling: \t" + currentLoc.getSpeed());
	        		System.out.println("Companion: \t\t" + friendName +"\n");
	    			
	    			enemy TheEnemy = enemyFactory.makeEnemy();

	    			enemyHealth = TheEnemy.getEnemyHealth();
	    			maxEnemyHealth = TheEnemy.getEnemyHealth();
	    			TheEnemy.appearDisplay();
	    			health = health - TheEnemy.enemyAttacks();
	    			distanceToGo = (int) (distanceToGo - currentLoc.getSpeed());
	    			
	    			while(enemyHealth > 0)
	    			{
	            		System.out.println("The Player is Fighting with The " +TheEnemy.getName()+ ".");
	            		System.out.println(TheEnemy.getName()+ "'s HP:\t"+enemyHealth+ "/" +maxEnemyHealth);
	            		System.out.println("Player's HP:\t" +health+ "/100");
	    				System.out.println("\n\t\tWhat would you like to do?");
	    				System.out.println("\t\t1. Attack.");
	    				System.out.println("\t\t2. Heal.");
	    				
	    				String input = in.nextLine();
	    				
	    				if(input.equals("1"))
	    				{
	    				/*	if(TheEnemy.getName().equals("Boa Constrictor"))
	    					{
	    						snake adapter = new boaConstrictorAdapter((boaConstrictor)TheEnemy);
	    						health = health - adapter.enemyAttacks();
		    					enemyHealth = enemyHealth - damage;
		    					System.out.println("The Player Attacks the "+TheEnemy.getName()+".\nDamage Done: " +damage+ "\n");
		    					
		    					if(health<1)
		    					{
		    						System.out.println("You were Defeated in Battle.");
		    						break;
		    					}
	    					}
	    					
	    					else
	    					{*/
		    					health = health - TheEnemy.enemyAttacks();
		    					enemyHealth = enemyHealth - damage;
		    					System.out.println("The Player Attacks the "+TheEnemy.getName()+".\nDamage Done: " +damage+ "\n");
		    					
		    					if(health<1)
		    					{
		    						System.out.println("You were Defeated in Battle.");
		    						break;
		    					}
		    			//	}
	    				}
	    				
	    				else if(input.equals("2"))
	    				{
	    					if(foodSnack > 0)
	    					{
	    						health += foodRestore;
	    						
	    						if(health > 100)
	    						{
	    							health = 100;
	    						}
	    						
	    						foodSnack--;
	    						System.out.println("You Ate Some Raw Meat, Restoring "+foodRestore+" health.");
	    						
	    						if(foodSnack==1)
	    						{
	    							System.out.println("You Have "+foodSnack+" Piece of Raw Meat Remaining.\n");
	    						}
	    						
	    						else
	    						{
	    							System.out.println("You Have "+foodSnack+" Piece's of Raw Meat Remaining.\n");
	    						}
	    					}
	    					
	    					else
	    					{
	    						System.out.println("You No Longer Have Any Food\n.");
	    					}
	    				}

	    				else
	    				{
	    					System.out.println("Please Re-enter Your Input & Choose One of the Following.");
	    					System.out.println("\t\t1. Attack.");
		    				System.out.println("\t\t2. Heal.");
	    				}
	    				
	    			}
	    			
	    			if(health<1)
	    			{
	    				System.out.println("You Have Not Been Able to Escape Alive, Please Try Again.");
	    				break;
	    			}
	    			
	    			else
	    			{
	    				System.out.println(TheEnemy.getName()+" was defeated.\n");
	
	    				
	    				article = "Memory #"+ (saveFiles+1) +"\n\nAs i began to move forward, i heard a loud and alarming \nscream from behind me. It was an angry "
	    						+TheEnemy.getName()+ " \nand whether from confusion of the events or just his \npure raw aggressive nature, the "+TheEnemy.getName()+ " \nbegan to attack me."
	    								+ "\n\nHe was tough, but i managed to survive. I need to keep moving \nforward, i am getting nearer to the exit.";
	    				
	    				originator.set(article);
	    				caretaker.addMemento(originator.save());
	    				saveFiles++;
	    				currentArticle++;
	    				gui.setScreen(article);
	    				//gui.setCurrentArticle(currentArticle);
	    				
	            		completionFacade completeCheck = new completionFacade(distanceToGo, motherFound);
	    				
	    				if(completeCheck.completionCheck() == true)
	    				{
	    					completeCheck.completionCheck();
	    					System.exit(0);
	    				}
	    				
	    				else
	    				{
	   	    				if(rand.nextInt(100) < dropRand)
		    				{
		    					foodSnack++;
		    					System.out.println("You Were Able to Tear a Piece of Meat from the Defeated " +TheEnemy.getName()+ "'s Body.");

		    					if(foodSnack==1)
	    						{
	    							System.out.println("You Have "+foodSnack+" Piece of Raw Meat Remaining.");
	    						}
	    						
	    						else
	    						{
	    							System.out.println("You Have "+foodSnack+" Piece's of Raw Meat Remaining.");
	    						}
		    					
		    					System.out.println("\nWhat would you like to do?");
		    					System.out.println("1. Continue Fighting.");
		    					System.out.println("2. Quit.");
		    					
		    					String input = in.nextLine();
		    					
		    					while(!input.equals("1") && !input.equals("2"))
		    					{
		    						System.out.println("Please Re-enter Your Input & Choose One of the Following.");
			    					System.out.println("\t1. Continue Fighting.");
				    				System.out.println("\t2. Quit.");
		    						input = in.nextLine();
		    					}
		    					
		    					if(input.equals("1"))
		    					{
		    						System.out.println("Continue fighting.");
		    					}
		    					else if(input.equals("2"))
		    					{
		    						System.out.println("You Have Chosen to Quit the Game.");
		    						break;
		    					}	
		    				}
	    				}		    	
    			}
    		}
		
    	
	}
	
	
}
