/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play.martycraft.net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bukkit.configuration.file.YamlConfiguration;

/**
 *
 * @author Calvin
 */
public class MartyConfiguration {
    
private main plugin;
private File configFile;
private YamlConfiguration config;
	
public MartyConfiguration(main plugin) {
	this.plugin = plugin;
	configFile = new File(plugin.getDataFolder(), "config.yml");
	generateConfigs();
}
	
void generateConfigs() {
	plugin.saveDefaultConfig();
	if (!configFile.exists()) {
		try (InputStream is = plugin.getResource("config.yml"); 
		OutputStream os = new FileOutputStream(configFile)) {
			int readBytes;
			byte[] buffer = new byte[4096];
			while ((readBytes = is.read(buffer)) > 0) {
	  			os.write(buffer, 0, readBytes);
			}
		 } catch (IOException e) {
			e.printStackTrace();
		}
	}
	config = YamlConfiguration.loadConfiguration(configFile);
}
}