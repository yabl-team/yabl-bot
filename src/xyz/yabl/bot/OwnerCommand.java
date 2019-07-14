package xyz.yabl.bot;

import discord4j.core.event.domain.message.MessageCreateEvent;

public class OwnerCommand extends Command {

	public OwnerCommand() {
		super("owner", "Return the owner of a bot. Usage: yabl!owner <user id or mention>");
	}

	@Override
	public String execute(String msg, MessageCreateEvent e) {
		return null;
	}

}
