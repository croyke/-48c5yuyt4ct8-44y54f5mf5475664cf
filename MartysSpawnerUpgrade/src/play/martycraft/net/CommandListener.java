package play.martycraft.net;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


/**
 *
 * @author Calvin
 */
public class CommandListener implements CommandExecutor {

    public CommandListener() {

    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) { //Kijkt als de gene die het commando stuurt geen speler is(we willen dat hij een speler is)
            sender.sendMessage(ChatColor.RED + "You have to be a player to execute this command!");
            return false; //We gaan niet verder met het uitvoeren van het commando omdat de sender geen speler is.
        }
        if (args == null) {
            sender.sendMessage(ChatColor.RED + "You have to supply at least one argument");
            return false;
        }

        Player p = (Player) sender; // We maken een speler variabel waarbij wij de sender een speler dwingen te zijn wat kan aangezien we hebben gecheckt of de sender een speler is.
        if (!p.hasPermission("Fastgm.use")) {
            p.sendMessage(ChatColor.RED + "you don't have permission to use this command");
        }
        
        if (args.length >= 1) { 
            } else if (args[0].equalsIgnoreCase("help")) { 
                p.sendMessage(ChatColor.BLUE + "=-=-=-=" + ChatColor.GOLD + "MartysSpawnerUpgrade" + ChatColor.BLUE + "=-=-=-=\n1. /msu info shows info about the plugin\n2. /msu help brings you to this message\n3. /msu usage gives a discription about how the plugin works");
                return false;
            } else if (args[0].equals("usage")) { 
                p.setGameMode(GameMode.ADVENTURE);
                p.sendMessage(ChatColor.GOLD + "=-=-=-=" + ChatColor.DARK_BLUE + "MartysSpawnerUpgradeUsage" + ChatColor.GOLD + "=-=-=-=" + ChatColor.AQUA + "\nright click an spawner to open the MartysSpawnerUpgrade gui. in this gui you find 5 tiers, you have to buy tier 1 first then you unlock tier 2 and tier 2 to unlock tier 3 etc. every tier gives better spawner stats, so its will spawn more or the requirdplayerrange so you will still trigger the spawner ... blocks away");
                return false; 
            } else if (args[0].equalsIgnoreCase("Info")) { 
                p.sendMessage(ChatColor.BLUE + "=-=-=-=" + ChatColor.DARK_RED + "MartysSpawnerUpgrade" + ChatColor.BLUE 
                        +"=-=-=-=" + ChatColor.BLUE + "\nCreator:" + ChatColor.GREEN + " Croyke" + ChatColor.BLUE + "\nPoweredBy:" + ChatColor.GREEN + " MartyCraft (play.martycraft.net)");                            
            return false;
            } else { //Als hij geen van de bovenstaande keuzes heeft gekozen
                sender.sendMessage(ChatColor.DARK_RED + "Command not found, use /msu help for the commands.");
                return false;
            }
    
    return false;
}
}
     
        
