package xyz.yabl.bot;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.ini4j.Wini;

import discord4j.core.DiscordClient;
import discord4j.core.DiscordClientBuilder;
import discord4j.core.event.domain.message.MessageCreateEvent;

public class Main {

	public static void main(String[] args) {
		Wini config;
		try {
			config = new Wini(new File("config.ini"));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
			return;
		}
		String token = config.get("config", "bottoken");
		final DiscordClient client = new DiscordClientBuilder(token).build();

		Map<String,Command> commands = new HashMap<>();
		
		commands.put("yabl!about", new AboutCommand());
		commands.put("yabl!help", new HelpCommand());
		commands.put("yabl!owner", new OwnerCommand());
		commands.put("yabl!bots", new BotsCommand());
		commands.put("yabl!uptime", new UptimeCommand());
		commands.put("yabl!pos", new PosCommand());
		commands.put("yabl!queue", new QueueCommand());
		commands.put("yabl!badbots", new BadBotsCommand());
		commands.put("yabl!verify", new VerifyCommand());
		commands.put("yabl!delete", new DeleteCommand());
		
		client.getEventDispatcher().on(MessageCreateEvent.class)
			.filter(e->e.getMessage().getContent()
					.map(a->a.split(" "))
					.map(a->a[0])
					.map(commands::containsKey).orElse(false))
			.map(e->e.getMessage().getContent()
					.map(a->a.split(" "))
					.map(a->a[0])
					.map(commands::get)
					.map(a->a.execute(e.getMessage().getContent().get(),e)))
			.subscribe();

		client.login().block();
	}
}
