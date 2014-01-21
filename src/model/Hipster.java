package model;

public class Hipster
{
	private String name;
	private String hipsterType;
	private String hipsterPhrase;
	private String [] hipsterBooks;

	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Spencer";
		hipsterType = "Student Hipster";
		hipsterPhrase = "Cheesy";
		
		fillTheBooks();
	}
	public Hipster(String name, String hipsterType, String hipsterPhrase, String [] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getHipsterType()
	{
		return hipsterType;
	}
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}
	public String [] getHipsterBooks()
	{
		return hipsterBooks;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}
	
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}
	
	public void setHipsterBooks(String [] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Dicionary";
		hipsterBooks[1] = "Snow Crash";
		hipsterBooks[2] = "1984";
		hipsterBooks[3] = "American Gods";
		hipsterBooks[4] = "V for Vendetta";
	}
}