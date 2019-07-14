package xyz.yabl.bot;

import discord4j.core.event.domain.message.MessageCreateEvent;

public abstract class Command {

	public String name;
	public String description;
	
	public Command(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return this.name+": "+this.description;
	}
	
	public abstract String execute(String msg,MessageCreateEvent e);
	
}
