import java.util.ArrayList;
	 
class caretaker 
{
	ArrayList<memento> savedArticles = new ArrayList<memento>();
	 
	public void addMemento(memento m) 
	{ 
		savedArticles.add(m); 
	}
	    
	public memento getMemento(int index) 
	{ 
    	return savedArticles.get(index); 
    }
}
