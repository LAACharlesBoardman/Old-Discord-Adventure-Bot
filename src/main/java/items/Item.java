package items;

public abstract class Item
{
	//Properties
	private String itemName;
	private String itemDesc;
	private double itemValue;
	private int itemQuantity;
	
	//getters & setters
	public String getItemName()
	{
		return itemName;
	}
	public void setItemName(String name)
	{
		this.itemName = name;
	}
	
	public String getItemDesc()
	{
		return itemDesc;
	}
	public void setItemDesc(String desc)
	{
		this.itemDesc = desc;
	}
	
	public double getItemValue()
	{
		return itemValue;
	}
	public void setItemValue(double value)
	{
		this.itemValue = value;
	}
	
	public int getItemQuantity()
	{
		return itemQuantity;
	}
	public void setItemQuantity(int quantity)
	{
		this.itemQuantity = quantity;
	}
	
	//Methods
	public void addOne()
	{
		this.itemQuantity++;
	}
	
	//Constructors
	public Item (String name, String desc, double value, int quantity)
	{
		this.itemName = name;
		this.itemDesc = desc;
		this.itemValue = value;
		this.itemQuantity = quantity;
	}
	public Item (String name, String desc, double value)
	{
		this(name, desc, value, 1);
	}
}