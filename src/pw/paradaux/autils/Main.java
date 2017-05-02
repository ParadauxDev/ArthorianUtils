	package pw.paradaux.autils;
import org.bukkit.plugin.java.JavaPlugin;
import pw.paradaux.autils.commands.arthorian;
import pw.paradaux.autils.commands.arthorianadmin;
import pw.paradaux.autils.commands.catalyst;
import pw.paradaux.autils.commands.staff;
import pw.paradaux.autils.microcommands.discord;
import pw.paradaux.autils.microcommands.fine;
import pw.paradaux.autils.microcommands.ip;
import pw.paradaux.autils.microcommands.owner;
import pw.paradaux.autils.microcommands.paradaux;
import pw.paradaux.autils.microcommands.website;
public class Main extends JavaPlugin {
	@Override
 	public void onEnable(){
 		// Commands -- Fully Fledged, Argument Taking Commands
		this.getCommand("arthorian").setExecutor(new arthorian());
		this.getCommand("arthorianadmin").setExecutor(new arthorianadmin());
		this.getCommand("catalyst").setExecutor(new catalyst());
		this.getCommand("staff").setExecutor(new staff());
		// Micro Commands, Static, No Arguments.
		this.getCommand("discord").setExecutor(new discord());
		this.getCommand("fine").setExecutor(new fine());
		this.getCommand("ip").setExecutor(new ip());
		this.getCommand("owner").setExecutor(new owner());
		this.getCommand("paradaux").setExecutor(new paradaux());
		this.getCommand("website").setExecutor(new website());}
	public void onDisable(){}}
