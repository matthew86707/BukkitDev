package com.mcs.ndn;

import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
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
					switch (r.nextInt(5)) {
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
		return false;
	}

}
