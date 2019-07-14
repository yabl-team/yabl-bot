package xyz.yabl.bot;

import discord4j.core.event.domain.message.MessageCreateEvent;

public class HelpCommand extends Command {

	public HelpCommand() {
		super("Help", "Display a list of commands and get their usages. Usage: yabl!help <command>");
	}

	@Override
	public String execute(String msg, MessageCreateEvent e) {
		return null;
	}

}
