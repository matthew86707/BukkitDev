package com.mcs.ndn;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Asshole implements Listener {
	Random r = new Random();

	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		Player player = (Player) event.getPlayer();
		if (r.nextInt(1000) == 0) {
			if (r.nextBoolean()) {
				event.setMessage("#" + event.getMessage());
			} else {
				String[] quotes = { "...", "sombody is typing for my account", "Vape Nation", "like me on instagram" };
				event.setMessage(quotes[r.nextInt(quotes.length)]);
			}
		}
		if (event.getPlayer().getName().equals("AaronNerd07")) {
			String[] quotes = { "...", "Such a good movie...", "IM BATMAN", "Hmm...what to do with $400?",
					"Subscribe to Universe Comics!", "Hello YouTube!", "Peace", "Im not gonna waste my shot!",
					"Im not stupid?", "Delete Channel ->[Yes]<- [No]", "Im a diamond in the rough", "...",
					"Bain, Bain is the source of the payday gang!", "Dammit james, you did not give me enough quotes",
					"sombody is typing for my account", "Syntax error: expecting ';'" };
			Random r = new Random();
			if (r.nextInt(200) == 0) {
				event.setMessage(quotes[r.nextInt(quotes.length)]);
			}
			// event.setMessage(quotes[quote]);
			//
			// Player player = (Player) event.getPlayer();
			//
			// if(quote == 6){
			// //player.kickPlayer("Peace");
			// }
			// if(quote == 11){
			// event.setMessage("DDoS me pls:" + player.getAddress());
		} else if (event.getPlayer().getName().equals("chmilk")) {
			String message = event.getMessage();
			if (r.nextInt(50) == 47) {
				event.setMessage(message + ChatColor.RED + ", and by, " + ChatColor.WHITE + message + ChatColor.RED
						+ " I mean HEY ASSHOLES!");
			} else if (r.nextInt(50) > 47) {
				event.setMessage(message + ChatColor.RED + ", and i worked on this plugin");
			} else {
				event.setMessage(ChatColor.MAGIC + message);
			}
		} else if (event.getPlayer().getName().equals("matthew816")) {
			String message = event.getMessage();
			if (r.nextInt(50) == 47) {
				event.setMessage(message + ", and I need a buy");
			} else if (r.nextInt(50) == 47) {
				event.setMessage(message + ", remember 2-1-2, look at the minimap for godsake!");
			}
		} else if (event.getPlayer().getName().equals("Enderlord_jbs")) {
			if (r.nextInt(50) == 47) {
				String message = event.getMessage();
				message += ", And matthew is the best brother in the world...";
				event.setMessage(message);
			}

		} else if (event.getPlayer().getName().equals("cupcake20009")) {
			if (r.nextInt(500) == 69) {
				String message = event.getMessage();
				message += ", and i really like james";
				event.setMessage(message);
			}

		}

	}

}
