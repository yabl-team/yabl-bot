package xyz.yabl.bot;

import discord4j.core.event.domain.message.MessageCreateEvent;

public class UptimeCommand extends Command {

	public UptimeCommand() {
		super("uptime", "Display the uptime of a certain bot.");
	}

	@Override
	public String execute(String msg, MessageCreateEvent e) {
		return null;
	}

}
