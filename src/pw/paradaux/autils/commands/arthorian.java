package pw.paradaux.autils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pw.paradaux.autils.API.language;

public class arthorian implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("arthorian")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("[AUtils] ]You must run this command ingame!");
			} else {
				if (args.length > 0) {
					if (args[0].equalsIgnoreCase("help")) {
						language.helpMessage(sender);
					} else if (args[0].equalsIgnoreCase("clear")) {
						int x = 200;
						while (x > 1) {
							sender.sendMessage("");
							x = x - 1;
						}
					} else if (args[0].equalsIgnoreCase("credits")) {
						language.credits(sender);
					} else if (args[0].equalsIgnoreCase("version")) {
						language.version(sender);
					}
				} else {
					language.helpMessage(sender);
				}
			}
		}
		return true;
	}
}