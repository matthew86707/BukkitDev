package com.mcs.ndn;

import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.PlaySoundCommand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NDN extends JavaPlugin {
	float afkx;
	float afky;
	float afkz;
	Random r = new Random();

	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new Asshole(), this);
		Logger logger = getLogger();
		logger.info(pdfFile.getName() + "Has been enabled!");
	}

	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		logger.info(pdfFile.getName() + "Has been disabled!");
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		Logger logger = getLogger();
		logger.info("LABEL: " + label);
		if (label.equals("sun")) {
			if (sender instanceof Player) {
				getServer().dispatchCommand(getServer().getConsoleSender(), "weather clear");
				getServer().dispatchCommand(getServer().getConsoleSender(), "money take " + player.getName() + " 8");
				getServer().dispatchCommand(getServer().getConsoleSender(), "money give city 8");
				player.sendMessage(ChatColor.RED + "-$8");
				player.sendMessage(ChatColor.GOLD + "Thank you for your donation, enjoy the nice weather!");
			}
		}
		if (label.equals("day")) {
			if (sender instanceof Player) {

				getServer().dispatchCommand(getServer().getConsoleSender(), "time set 0");
				getServer().dispatchCommand(getServer().getConsoleSender(), "money take " + player.getName() + " 20");
				getServer().dispatchCommand(getServer().getConsoleSender(), "money give city 20");
				player.sendMessage(ChatColor.RED + "-$20");
				player.sendMessage(ChatColor.GOLD + "Thank you for your donation, time has been set to 0!");
			}

		}
		if (label.equals("afk")) {

			getServer().dispatchCommand(getServer().getConsoleSender(), "say " + player.getName() + " has gon AFK");
			//TODO: teleport to afk room
		}

		if (label.equals("spawn")) {
			int xDisplacement = Math.abs(player.getLocation().getBlockX()) - 182;
			int zDisplacement = Math.abs(player.getLocation().getBlockZ()) - 294;
			if (xDisplacement > 100 && zDisplacement > 100) {
				int cost = (xDisplacement+zDisplacement)/75;
				getServer().dispatchCommand(getServer().getConsoleSender(), "money take " + player.getName()  + " " + cost);
				getServer().dispatchCommand(getServer().getConsoleSender(), "money give city " + cost);
				player.sendMessage(ChatColor.RED + "-$" + cost);
				player.sendMessage(ChatColor.GOLD + "You have been teleported to spawn");
				
			
			getServer().dispatchCommand(getServer().getConsoleSender(), "tp " + player.getName() + " 182, 70, 294");
		}
		if (label.equals("dev") && (player.getName().equals("chmilk") || player.getName().equals("matthew816"))) {

			player.sendMessage(ChatColor.RED + "NDN is working");
		}
		if (label.equals("lego")) {
			String mess = "Go home, LegoClone";
			if (sender instanceof Player) {

				for (int i = 0; i < 10; i++) {
					Random r = new Random();
					switch (r.nextInt(6)) {
					case 0:
						player.sendMessage(ChatColor.RED + mess);
						break;
					case 1:
						player.sendMessage(ChatColor.YELLOW + mess);
						break;
					case 2:
						player.sendMessage(ChatColor.BLUE + mess);
						break;
					case 3:
						player.sendMessage(ChatColor.GREEN + mess);
						break;
					case 4:
						player.sendMessage(ChatColor.WHITE + mess);
						break;
					case 5:
						player.sendMessage(ChatColor.WHITE + "enolCogeL ,emoh oG");
						break;
					}
				}
				getServer().dispatchCommand(getServer().getConsoleSender(), "kick legoclone09");
			}
		}
		if(label.equals("startsax")){
			
			player.getWorld().playSound(player.getLocation(), Sound.RECORD_MALL, 1, 1);
		}
		if(label.equals("sorry")){
			
			player.getWorld().playSound(player.getLocation(), Sound.RECORD_FAR, 1, 1);
		}
		if(label.equals("music")){
			
			player.getWorld().playSound(player.getLocation(), Sound.RECORD_WARD, 1, 1);
		}
		if(label.equals("yo")){
			
			player.getWorld().playSound(player.getLocation(), Sound.RECORD_BLOCKS, 1, 1);
		}
		if(label.equals("usa")){
			
			player.getWorld().playSound(player.getLocation(), Sound.RECORD_13, 1, 1);
		}
		if(label.equals("pd2")){
			
			player.getWorld().playSound(player.getLocation(), Sound.RECORD_CAT, 1, 1);
			player.sendMessage(ChatColor.YELLOW + "Bain:");
			Random r = new Random();
			int one = r.nextInt(3);
			if(one == 0){
			player.sendMessage(ChatColor.WHITE + "Fuck me, we needed those cooks. I'm going with chloride.");
			}
			if(one == 1){
				player.sendMessage(ChatColor.WHITE + "Caustic chloride. Says it is some solid form... Wait a... Should be that hydrogen, right?");
				}
			if(one == 2){
				player.sendMessage(ChatColor.WHITE + "It needs hydrogen chloride, for sure... No, no wait... Yeah, OK.");
				}
		}
		}
		return false;
	}
	
}
