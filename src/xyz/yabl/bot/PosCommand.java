package xyz.yabl.bot;

import discord4j.core.event.domain.message.MessageCreateEvent;

public class PosCommand extends Command {

	public PosCommand() {
		super("pos", "Get the position of a bot in the queue. Usage: yabl!pos <bot mention or id>");
	}

	@Override
	public String execute(String msg, MessageCreateEvent e) {
		return null;
	}

}
