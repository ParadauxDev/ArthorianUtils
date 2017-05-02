package pw.paradaux.autils.microcommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import pw.paradaux.autils.API.language;

public class ip implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("ip")) {
			language.ip(sender);
		}
	return true;
	}
}
