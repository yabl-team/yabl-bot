package xyz.yabl.bot;

import discord4j.core.event.domain.message.MessageCreateEvent;

public class QueueCommand extends Command {

	public QueueCommand() {
		super("queue", "Get statistics about the bot queue. Usage: yabl!queue [-L/--list]");
	}

	@Override
	public String execute(String msg, MessageCreateEvent e) {
		return null;
	}

}
