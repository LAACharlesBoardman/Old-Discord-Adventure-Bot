package items;

public class WeaponItem extends Item
{
	//Properties
	private int weaponDmg;
	
	//getters & setters
	public int getWeaponDmg()
	{
		return weaponDmg;
	}
	public void setWeaponDmg(int dmg)
	{
		this.weaponDmg = dmg;
	}
	
	//Constructors
	public WeaponItem(String name, String desc, double value, int dmg)
	{
		super(name, desc, value);
		this.weaponDmg = dmg;
	}
}