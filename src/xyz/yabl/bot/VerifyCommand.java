package xyz.yabl.bot;

import discord4j.core.event.domain.message.MessageCreateEvent;

public class VerifyCommand extends Command {

	public VerifyCommand() {
		super("verify", "Verify a bot in the queue. Usage: yabl!verify <Bot mention or id>");
	}

	@Override
	public String execute(String msg, MessageCreateEvent e) {
		return null;
	}

}
