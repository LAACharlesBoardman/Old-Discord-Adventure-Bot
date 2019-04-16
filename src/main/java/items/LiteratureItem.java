package items;

public class LiteratureItem extends Item
{
	//Properties
	private String content;
	
	//getters & setters
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	
	//Constructors
	public LiteratureItem(String name, String desc, double value, String content)
	{
		super(name, desc, value);
		this.content = content;
	}
	
}