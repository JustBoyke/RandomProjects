package me.pro.hoi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
{
  public void onEnable() { Bukkit.broadcastMessage("De plugin staat aan"); }

  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (cmd.getName().equalsIgnoreCase("luc_de_beste")) {
      Player p = (Player)sender;
      p.sendMessage(ChatColor.RED + "Luc" + ChatColor.WHITE + " is de beste pluginmaker ooit echt beter dan boyke!");
      return false;
    } 
    return false;
  }
}
