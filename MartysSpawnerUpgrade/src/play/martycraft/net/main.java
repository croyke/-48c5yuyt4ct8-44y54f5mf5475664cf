         /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play.martycraft.net;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import play.martycraft.net.MartyConfiguration;

/**
 *
 * @author Calvin
 */
public class main extends JavaPlugin {
    
    public MartyConfiguration Configs;
    private static main plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Configs = new MartyConfiguration(this);
        getCommand("msu").setExecutor(new CommandListener());
        Bukkit.getServer().getPluginManager().registerEvents( new TestListener(), this);
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "=-=-=-=MartysSpawnerUpgrade=-=-=-=");
        Bukkit.getConsoleSender().sendMessage(ChatColor.MAGIC + "Is now activated");
        Bukkit.getConsoleSender().sendMessage(ChatColor.MAGIC + "Created By: Croyke");
        Bukkit.getConsoleSender().sendMessage(ChatColor.MAGIC + "Powered by: MartyCraft (play.martycraft.net)");
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "=-=-=-=MartysSpawnerUpgrade=-=-=-=");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "=-=-=-=MartysSpawnerUpgrade=-=-=-=");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "Is now deactivated");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "Created By: Croyke");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "Powered by: MartyCraft (play.martycraft.net)");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "=-=-=-=MartysSpawnerUpgrade=-=-=-=");

    }
        public static main getInstance() {
        return plugin;
    }
        }
    

        


