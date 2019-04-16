package commands;

import java.util.Arrays;
import java.util.List;
//import java.util.TreeMap;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class HelpCommand extends Command
{
	/*
	private TreeMap<String, Command> commands;
	public HelpCommand()
	{
		commands = new TreeMap<>();
	}
	
	public Command registerCommand(Command command)
	{
		commands.put(command.getAlliases().get(0), command);
		return command;
	}
	*/
	
	@Override
	public void onCommand(MessageReceivedEvent e, String[] args)
	{
		if(!e.isFromType(ChannelType.PRIVATE))
		{
			e.getTextChannel().sendMessage(new MessageBuilder()
					.append(e.getAuthor())
					.append(": Help information was sent as a private message")
					.build()).queue();
		}
		//sendPrivate(e.getAuthor().openPrivateChannel().complete(), args); //sendPrivate not implemented
	}

	@Override
	public List<String> getAlliases()
	{
		return Arrays.asList(".help", ".commands");
	}
	
}