package player;

public class Player
{
	//Properties
	private String playerName;
	private Inventory playerInv;
	
	//getters & setters
	public String getName()
	{
		return playerName;
	}
	public void setName(String name)
	{
		if(name.length() > 15 | name.length() < 1)
			throw new IllegalArgumentException("Name must be less than 15 characters.");
		this.playerName = name;
	}
	
	public Inventory getInv()
	{
		return playerInv;
	}
	public void setInv (Inventory inv)
	{
		this.playerInv = inv;
	}
	
	//Constructors
	public Player (String name, Inventory inv)
	{
		setName(name);
		this.playerInv = inv;
	}
}