package com.mcs.ndn;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Asshole implements Listener{
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event){
//		if(event.getPlayer().getName().equals("AaronNerd07")){
//			String[] quotes = {"...", "Such a good movie...", "IM BATMAN", "Hmm...what to do with $400?", "Subscribe to Universe Comics!", "Hello YouTube!", "Peace", "Im not gonna waste my shot!", "Im not stupid?", "Delete Channel ->[Yes]<-  [No]", "Im a diamond in the rough", "..."};
//			Random r = new Random();
//			int quote = r.nextInt(quotes.length);
//			event.setMessage(quotes[quote]);
//			
//			Player player = (Player) event.getPlayer();
//			
//			if(quote == 6){
//				//player.kickPlayer("Peace");
//			}
//			if(quote == 11){
//				event.setMessage("DDoS me pls:" + player.getAddress());
//			}
	if(event.getPlayer().getName().equals("chmilk")){
		Random r = new Random();
		if(r.nextInt(50) > 47){
		String message = event.getMessage();
		event.setMessage(message + ", and by, " + message + " I mean HEY ASSHOLES!");
		}
	}
//		}else if(event.getPlayer().getName().equals("matthew816")){
//			String message = event.getMessage();
//			if(Math.random() > 0.5f){
//			event.setMessage(message + ", and I need a buy");
//			}else{
//				event.setMessage(message + ", remember 2-1-2, look at the minimap for godsake!");
//			}
//			}else if(event.getPlayer().getName().equals("Enderlord_jbs")){
//				String message = event.getMessage();
//				message += ", And matthew is the best brother in the world...";
//				event.setMessage(message);
//			}
		Player player = (Player) event.getPlayer();

		}
	
	}

