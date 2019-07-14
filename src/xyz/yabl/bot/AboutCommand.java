package xyz.yabl.bot;

import discord4j.core.event.domain.message.MessageCreateEvent;

public class AboutCommand extends Command {

	public AboutCommand() {
		super("about", "Display information about the bot. Usage: yabl!about");
	}

	@Override
	public String execute(String msg, MessageCreateEvent e) {
		return null;
	}

}
