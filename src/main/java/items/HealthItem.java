package items;

public class HealthItem extends Item
{
	//Properties
	private int hpRestore;
	
	//getters & setters
	public int getHpRestore()
	{
		return hpRestore;
	}
	public void setHpRestore(int hpRestore)
	{
		this.hpRestore = hpRestore;
	}
	
	//Constructors
	public HealthItem(String name, String desc, double value, int hpRestore)
	{
		super(name, desc, value);
		this.hpRestore = hpRestore;
	}
}