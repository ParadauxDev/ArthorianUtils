package pw.paradaux.autils.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pw.paradaux.autils.API.language;

public class arthorianadmin implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("arthorianadmin")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("[AUtils] ]You must run this command ingame!");
			} else if (sender.hasPermission("au.admin")) {
				if (args.length > 0) {
					if (args[0].equalsIgnoreCase("help")) {
						language.adminHelpMessage(sender);
					} else if (args[0].equalsIgnoreCase("globalclear")) {
						int x = 32;
						while (x > 1) {
							Bukkit.broadcastMessage("");
							x = x - 1;
						}
					}
					else if(args[0].equalsIgnoreCase("changelog")) {
						language.changelog(sender);
					}
				} else {
					language.adminHelpMessage(sender);
				}
			}
		}
		return true;
	}
}
