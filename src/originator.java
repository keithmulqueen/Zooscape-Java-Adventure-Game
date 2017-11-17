public class originator
{
	private String article;

	public void set(String newArticle) 
	{
		System.out.println("*New Memory*");
		this.article = newArticle;
	}

	public memento save() 
	{
	 	return new memento(article);
	}
	        
	public String load(memento memento) 
	{
		article = memento.getArticle();
	    return article;
	}
	     
}
