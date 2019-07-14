package xyz.yabl.bot;

import discord4j.core.event.domain.message.MessageCreateEvent;

public class BadBotsCommand extends Command {

	public BadBotsCommand() {
		super("badbots","Send a list of all bots with less than 70% uptime. Usage: yabl!badbots");
	}

	@Override
	public String execute(String msg, MessageCreateEvent e) {
		return null;
	}

}
