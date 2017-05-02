package pw.paradaux.autils.API;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import net.md_5.bungee.api.ChatColor;
public class language {
	String prefix[];
//	Use Define(StringGold, StringWhite, sender) to use a (GoldText) (Whitetext) sendMessage()
//	Use title(StringBorder, sender) to make a [[-- StringBorder --]] sendMessage()
	public static void title(String border, CommandSender sender) {
		sender.sendMessage(ChatColor.GOLD + "[[ -- " + ChatColor.RESET + border + ChatColor.GOLD + " -- ]]");}
	public static void define(String one, String two, CommandSender sender) {
		sender.sendMessage(ChatColor.GOLD + one + ChatColor.RESET + two);}
	public static void comingsoon(CommandSender sender) {
		define("[Autils] ","This feature is not yet implemented, Sorry.", sender);}
	public static void helpMessage(CommandSender sender) {
		sender.sendMessage("");
		title("Arthorian Utilities", sender);
		sender.sendMessage(ChatColor.GOLD + "/arthorian help - " + ChatColor.RESET + "Displays this menu.");
		sender.sendMessage(ChatColor.GOLD + "/arthorianadmin - " + ChatColor.RESET + "Displays Administrator Commands.");
		sender.sendMessage(ChatColor.GOLD + "/arthorian clear - " + ChatColor.RESET + "Clears your chatbox.");
		sender.sendMessage(ChatColor.GOLD + "/arthorian version - " + ChatColor.RESET + "Displays version information.");
		sender.sendMessage(ChatColor.GOLD + "/arthorian credits - " + ChatColor.RESET + "Credits Information.");
		title("Arthorian Utilities", sender);}
		public static void credits(CommandSender sender) {
		sender.sendMessage("");
		title("Arthorian Utilities Credits", sender);
		sender.sendMessage(ChatColor.GOLD + "Main Developer - " + ChatColor.RESET + "ParadauxDev (https://paradaux.pw)");
		title("Arthorian Utilities Credits", sender);}
		public static void version(CommandSender sender) {
		sender.sendMessage("");
		title("Arthorian Version Info", sender);
		sender.sendMessage(ChatColor.GOLD + "Author: ParadauxDev");
		sender.sendMessage(ChatColor.GOLD + "Version: 2.0.test7 (Build: "+ ChatColor.RESET + "D19M4Y17.7" + ChatColor.GOLD + ")");
		sender.sendMessage(ChatColor.GOLD + "To view the changelog for this version run: " + ChatColor.RESET + "/arthorianadmin changelog");
		title("Arthorian Version Info", sender);}
	public static void adminHelpMessage(CommandSender sender) {
		sender.sendMessage("");
		title("Arthorian Admin Utilities", sender);
		sender.sendMessage(ChatColor.GOLD + "/arthorianadmin help - " + ChatColor.RESET + "Displays this menu.");
		sender.sendMessage(ChatColor.GOLD + "/arthorianadmin globalClear - " + ChatColor.RESET + "Clears everybody's chat.");
		title("Arthorian Admin Utilities", sender);}
	public static void website(CommandSender sender) {
		title("Website Link", sender);
		define("Website: ","http://arthorian.com", sender);
		title("Website Link", sender);}
	public static void discord(CommandSender sender) {
		title("Discord Link", sender);
		define("Website: ","http://arthorian.com", sender);
		title("Discord Link", sender);}
	public static void fine(CommandSender sender) {
		if(sender.hasPermission("au.fine")) {
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[AUtils] " + ChatColor.GOLD + "FINE THEN, FUCK OFF WILL YE");}}
	public static void ip(CommandSender sender) {
		title("IP Address", sender);
		define("IP: ","play.arthorian.com", sender);
		title("IP Address", sender);}
	public static void owner(CommandSender sender) {
		title("Owners of the Server", sender);
		define("Owner: ","Paradaux", sender);
		define("Owner: ","CatalystGaming", sender);
		title("Owners of the Server", sender);}
	public static void paradaux(CommandSender sender) {
		title("Paradauxical Information", sender);
		define("Contact Information: ","", sender);
		define("Website: ","https://paradaux.pw", sender);
		define("Discord: ","Paradaux#2864 ", sender);
		define("Skype: ", "ParadauxDev", sender);
		define("E-Mail","rian@paradaux.pw",sender);
		sender.sendMessage(ChatColor.GOLD + "Use Code 'Paradaux' for 10% off your first month @ CloudSerpent.com : Hosting Innovation");		
		title("Paradauxical Information", sender);}
	public static void changelog(CommandSender sender) {
		comingsoon(sender);
	}
	
}
