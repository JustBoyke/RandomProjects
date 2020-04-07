package me.boykev;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		System.out.print(ChatColor.GREEN + "Plugin voor boykev ingeschakeld");
	}
	
	public void onDisable() {
		System.out.print(ChatColor.RED + "Plugin voor boykev Uitgeschakeld");
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("boykev")) {
			Player p = (Player) sender;
			if(!p.getName().equalsIgnoreCase("boykev")) {
				p.sendMessage(ChatColor.RED + "Oeps, jij hebt hier geen toegang toe!");
				return false;
			}
			if(args.length < 1) {
				p.sendMessage(ChatColor.RED + "Er ging iets fout!");
				return false;
			}
			
			if(args[0].equalsIgnoreCase("techniek")) {
				Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&k|&r &4&lOwner &r&4&k| &fboykev &8- &cWerkt nu aan: &dServer Technische Zaken. &cHierdoor let dit stafflid "
						+ "niet op de chat, voor vragen contact een ander stafflid of connect op Discord!"));
				p.sendMessage(ChatColor.DARK_GREEN + "Message Send!");
				return false;
			}
			if(args[0].equalsIgnoreCase("meerlagg")) {
				Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWaarschuwing! &r&cDoor een technische aanpassing kan de server iets meer lagg ondervinden dan normaal! Onze"
						+ "excuses voor het ongemak!"));
				p.sendMessage(ChatColor.DARK_GREEN + "Message Send!");
				return false;
			}
			if(args[0].equalsIgnoreCase("laggopgelost")) {
				Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&2&lOpgelost! &r&cTechnische wijzging afgerond, lagg zou weer minder moeten worden!"));
				p.sendMessage(ChatColor.DARK_GREEN + "Message Send!");
				return false;
			}
			if(args[0].equalsIgnoreCase("restart")) {
				Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&d&lRestart! &r&cin verband met een update wordt de server binnenkort herstart!"));
				p.sendMessage(ChatColor.DARK_GREEN + "Message Send!");
				return false;
			}
			if(args[0].equalsIgnoreCase("aanwezig")) {
				Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&k|&r &4&lOwner &r&4&k| &fboykev &8- &ais nu weer aanwezig :)"));
				p.sendMessage(ChatColor.DARK_GREEN + "Message Send!");
				return false;
			}
			if(args[0].equalsIgnoreCase("zaken")) {
				Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&k|&r &4&lOwner &r&4&k| &fboykev &8- &cWerkt nu aan: &dServer Zaken. &cHierdoor let dit stafflid "
						+ "niet op de chat, voor vragen contact een ander stafflid of connect op Discord!"));
				p.sendMessage(ChatColor.DARK_GREEN + "Message Send!");
				return false;
			}
			
			
			
			return false;
		}
		
		
		return false;
	}
	
}
