package sinistarbot;

import java.util.ArrayList;
import javax.security.auth.login.LoginException;
import commands.*;
import items.*;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import player.Inventory;
import player.Player;

public class SinistarBot extends ListenerAdapter
{
	public static void main(String[] args) throws LoginException
	{
		JDA api = new JDABuilder(AccountType.BOT)
				//Bot token removed
				//Look into protecting secrets in a repository
				.setToken("")
				.addEventListener(new HelpCommand())
				//.addEventListener(new RollCommand())
				.buildAsync();
		api.addEventListener(new RollCommand());
		
		//#################################################################################
		
		//Inventory
		//Value of each item should fit into an integer despite value being a double data type
		//This is purely because it would make balancing easier
		//Value is left as double in case I decide to use a more complex currency system later
		//Create QuestItem class - Can be displayed separate from other items - Will be associated with a quest
		//Create Quests - May want to tie this into the random events feature
		Inventory inventory1 = new Inventory();
		//Weapons
		inventory1.addItem(new WeaponItem("Old Sword", "Rusty and dull.", 52.98, 5));
		//Health
		inventory1.addItem(new HealthItem("Health Potion", "Kind of tastes like fish.", 74.57, 25));
		inventory1.addItem(new HealthItem("Bandages", "These ones are already bloody.", 5.49, 15));
		//Literature
		inventory1.addItem(new LiteratureItem("Note", "A small, scrunched up note.", 0.00, "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
		//Junk
		inventory1.addItem(new JunkItem("Rusty Spoon", "Feels strangely satisfying.", 0.20));
		inventory1.addItem(new JunkItem("Bottle Cap", "Shame it doesn't have a star on it.", 0.05));
		inventory1.addItem(new JunkItem("Quil", "Someone, somewhere is looking for this.", 0.02));
		inventory1.addItem(new JunkItem("Creed CD", "Wait, that's illegal.", 0.10));
		
		//Player
		//Create a function that creates a player obj for a Discord member
		//It's name would be the Discord members @username#0000 (NOT IDEAl - Those can be changed if a member pays for Nitro)
		//Figure out a way of saving player progress. Reading and writing to a file would mean the bot can go down without losing progress
		//Open and read/write to a players file only when necessary
		//Create a save function to be called
		//Create a write function to be called
		Player player1 = new Player("Player One", inventory1);
		
		//Create a short event that is randomised for the player that asks for it
	}
}