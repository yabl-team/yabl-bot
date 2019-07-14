package xyz.yabl.bot;

import discord4j.core.event.domain.message.MessageCreateEvent;

public class BotsCommand extends Command {

	public BotsCommand() {
		super("bots", "List a user's bots. Usage: yabl!bots <user mention or id>");
	}

	@Override
	public String execute(String msg, MessageCreateEvent e) {
		return null;
	}

}
