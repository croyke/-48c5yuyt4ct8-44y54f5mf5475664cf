package play.martycraft.net;

import java.io.File;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Calvin
 */
public class Configs {
            private static main plugin;
	
	private File messagesFile;
	private FileConfiguration messages;
	
	private static Configs configManager;
	
	public Configs(main plugin) {
		configManager = this;
		messagesFile = new File(plugin.getDataFolder(), "messages.yml");
		messages = YamlConfiguration.loadConfiguration(messagesFile);
	}
	
	public void save() {
            configManager.save(messagesFile);
	}
	
	public String color(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}
	
	public File getMessagesFile() {
		return messagesFile;
	}
	
	public FileConfiguration getMessages() {
		return messages;
	}
	
	public static Configs getConfigs() {
		return configManager;
	}

    private void save(File messagesFile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    }

    

