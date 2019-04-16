package commands;

import java.util.Arrays;
import java.util.List;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class ItemCommand extends Command
{

	@Override
	public void onCommand(MessageReceivedEvent e, String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getAlliases()
	{
		return Arrays.asList(".items");
	}
	
}
