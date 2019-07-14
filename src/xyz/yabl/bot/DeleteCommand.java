package xyz.yabl.bot;

import discord4j.core.event.domain.message.MessageCreateEvent;

public class DeleteCommand extends Command {

	public DeleteCommand() {
		super("delete", "Delete a bot from the site. Usage: yabl!delete <bot id or mention>");
	}

	@Override
	public String execute(String msg, MessageCreateEvent e) {
		return null;
	}

}
