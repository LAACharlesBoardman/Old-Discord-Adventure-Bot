package commands;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class RollCommand extends Command
{
	private final Random dice = new Random();
	@Override
	public void onCommand(MessageReceivedEvent e, String[] args)
	{
		int lowerBound;
		int upperBound;
		int roll;
		
		if (args.length == 1)
		{
			lowerBound = 1;
			upperBound = 20;
		}
		else if (args.length == 2)
		{
			lowerBound = 1;
			try
			{
				upperBound = Integer.parseInt(args[1]);
			}
			catch (NumberFormatException ex)
			{
				sendMessage(e, "The provided upperbound is not an integer! Provided value: " + args[1]);
                return;
			}
		}
		else
		{
			try
			{
				lowerBound = Integer.parseInt(args[1]);
			}
			catch(NumberFormatException ex)
			{
				sendMessage(e, "The provided lowerbound is not an integer! Provided value: " + args[1]);
                return;
			}
			
			try
			{
				upperBound = Integer.parseInt(args[2]);
			}
			catch(NumberFormatException ex)
			{
                sendMessage(e, "The provided upperBound is not an integer! Provided value: " + args[2]);
                return;
            }
        }
        //Instead of erroring when the upper and lower are out of order, just flip them.
        if (lowerBound > upperBound)
        {
            int temp = upperBound;
            upperBound = lowerBound;
            lowerBound = temp;
        }

        roll = dice.nextInt(upperBound - lowerBound) + lowerBound;
        sendMessage(e, "Rolled dice with range of [" + lowerBound + " - " + upperBound + "] and got: **" + roll + "**");
	}

	@Override
	public List<String> getAlliases()
	{
		return Arrays.asList(".roll",".dice");
	}
	
}