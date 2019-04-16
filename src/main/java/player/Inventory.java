package player;

import java.util.ArrayList;

import items.*;

public class Inventory
{
	//Properties
	//User ID of some sort
	ArrayList<Item> inventory = new ArrayList<Item>();
	
	public void addItem(Item item)
	{
		inventory.add(item);
	}
	
	//getters & setters
	//get inventory from disk if user is already registered. If not then create new file / row in DB.
}