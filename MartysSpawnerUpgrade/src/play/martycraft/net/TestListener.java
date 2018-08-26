/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play.martycraft.net;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 *
 * @author Calvin
 */

public class TestListener implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked(); // The player that clicked the item
        ItemStack clicked = event.getCurrentItem(); // The item that was clicked
        Inventory inventory = event.getInventory(); // The inventory that was clicked in
        
        int slot = event.getSlot();
        if (inventory.getName().equalsIgnoreCase("MartysSpawnerUpgrade"))  // The inventory is our custom Inventory
        // The inventory is our custom Inventory    
            if (clicked.getType() == Material.STAINED_GLASS_PANE) { // The item that the player clicked it dirt 
                if (slot == 4) {
                event.setCancelled(true); // Make it so the dirt is back in its original spot
                player.closeInventory(); // Closes there inventory
                player.sendMessage(ChatColor.DARK_GREEN + "Spawner upgraded to tier 1");
        } else if (slot == 24) {
            event.setCancelled(true);
            player.closeInventory();
            player.sendMessage(ChatColor.DARK_GREEN + "Spawner upgraded to tier 2");
        } else if (slot == 41) {
            event.setCancelled(true);
            player.closeInventory();
             player.sendMessage(ChatColor.DARK_GREEN + "Spawner upgraded to tier 3");
        } else if (slot == 39) {
            event.setCancelled(true);
            player.closeInventory();
            player.sendMessage(ChatColor.DARK_GREEN + "Spawner upgraded to tier 4");
        } else if (slot == 20) {
            event.setCancelled(true);
            player.closeInventory();
            player.sendMessage(ChatColor.DARK_GREEN + "Spawner upgraded to tier 5");
        } else if (clicked.getDurability() == 15) {    
             event.setCancelled(true);
            }
            } else {
                return;
        }}
      
@EventHandler
public void spawnEvent(PlayerInteractEvent event) {
    if (event.getClickedBlock().getState() instanceof CreatureSpawner) {
  if ((event.getAction() == Action.RIGHT_CLICK_BLOCK)) {
      Player p = event.getPlayer();
      CreatureSpawner mobspawner = (CreatureSpawner) event.getClickedBlock().getState(); // voor het geval dat je de block nodig hebt
        Inventory inventory = Bukkit.createInventory(null, 45, "MartysSpawnerUpgrade");
            p.openInventory(inventory);
                            ItemStack gamemodeS = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5);
                            ItemMeta gamemetaS = gamemodeS.getItemMeta();
                            gamemetaS.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aTier 1"));
                            ArrayList<String> sLore = new ArrayList<>();
                            sLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
                            sLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
                            sLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
                            sLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
                            gamemetaS.setLore(sLore);
                            gamemodeS.setItemMeta(gamemetaS);
        
                            ItemStack gamemodeC = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 4);
                            ItemMeta gamemetaC = gamemodeC.getItemMeta();
                            gamemetaC.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aTier 2"));
                            ArrayList<String> cLore = new ArrayList<>();
                            cLore.add(ChatColor.AQUA.toString());
                            cLore.add(ChatColor.AQUA.toString());
                            cLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
                            cLore.add(ChatColor.AQUA.toString());
                            gamemetaC.setLore(cLore);
                            gamemodeC.setItemMeta(gamemetaC);
                            
                            ItemStack gamemodeA = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3);
                            ItemMeta gamemetaA = gamemodeA.getItemMeta();
                            gamemetaA.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aTier 3"));
                            ArrayList<String> ALore = new ArrayList<>();
                            ALore.add(ChatColor.AQUA.toString());
                            ALore.add(ChatColor.AQUA.toString());
                            ALore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
                            ALore.add(ChatColor.AQUA.toString());
                            gamemetaA.setLore(ALore);
                            gamemodeA.setItemMeta(gamemetaA);
                            
                            ItemStack gamemodeSP = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 2);
                            ItemMeta gamemetaSP = gamemodeSP.getItemMeta();
                            gamemetaSP.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aTier 4"));
                            ArrayList<String> SPLore = new ArrayList<>();
                            SPLore.add(ChatColor.AQUA.toString());
                            SPLore.add(ChatColor.AQUA.toString());
                            SPLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
                            SPLore.add(ChatColor.AQUA.toString());
                            gamemetaSP.setLore(SPLore);
                            gamemodeSP.setItemMeta(gamemetaSP);
                            
                            ItemStack gamemodeQ = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1);
                            ItemMeta gamemetaQ = gamemodeQ.getItemMeta();
                            gamemetaQ.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aTier 5"));
                            ArrayList<String> QLore = new ArrayList<>();
                            QLore.add(ChatColor.AQUA.toString());
                            QLore.add(ChatColor.AQUA.toString());
                            QLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
                            QLore.add(ChatColor.AQUA.toString());
                            gamemetaQ.setLore(QLore);
                            gamemodeQ.setItemMeta(gamemetaQ);
                            
                            ItemStack Spawners = new ItemStack(Material.MOB_SPAWNER, 1, (byte) 1);
                            ItemMeta gamemetas = Spawners.getItemMeta();
                            gamemetas.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aSpawner Stats"));
                            ArrayList<String> Lore = new ArrayList<>();
                            sLore.add(ChatColor.AQUA.toString());
                            sLore.add(ChatColor.AQUA.toString());
                            sLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
                            sLore.add(ChatColor.AQUA.toString());
                            gamemetas.setLore(sLore);
                            Spawners.setItemMeta(gamemetas);
                            
                            ItemStack DetailD = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
                            ItemMeta gamemetaD = DetailD.getItemMeta();
                            gamemetaD.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a"));
                            ArrayList<String> DLore = new ArrayList<>();
                            DLore.add(ChatColor.AQUA.toString());
                            DLore.add(ChatColor.AQUA.toString());
                            DLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
                            DLore.add(ChatColor.AQUA.toString());
                            gamemetaD.setLore(DLore);
                            DetailD.setItemMeta(gamemetaD);
                            
                            // enchanted item in gui/ the tiers that are unlocked
                            
        //                    ItemStack Unlockedd = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5);
        //                    ItemMeta gamemetad = Unlockedd.getItemMeta();
        //                    gamemetad.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a"));
        //                    ArrayList<String> dLore = new ArrayList<>();
        //                    dLore.add(ChatColor.AQUA.toString());
        //                    dLore.add(ChatColor.AQUA.toString());
        //                    dLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
        //                    dLore.add(ChatColor.AQUA.toString());
        //                    gamemetaD.setLore(dLore);
        //                    Unlockedd.addEnchantment(Enchantment.LUCK, 1);
        //                    Unlockedd.setItemMeta(gamemetad);
        //                                                
        //                    ItemStack Unlockedx = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 4);
        //                    ItemMeta gamemetax = Unlockedx.getItemMeta();
        //                   gamemetax.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a"));
        //                    ArrayList<String> xLore = new ArrayList<>();
        //                    xLore.add(ChatColor.AQUA.toString());
        //                   xLore.add(ChatColor.AQUA.toString());
        //                    xLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
        //                    xLore.add(ChatColor.AQUA.toString());
        //                    gamemetax.setLore(xLore);
        //                    Unlockedx.addEnchantment(Enchantment.LUCK, 1);
        //                    Unlockedx.setItemMeta(gamemetax);
        //                    
        //                    ItemStack Unlockedz = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3);
        //                    ItemMeta gamemetaz = Unlockedz.getItemMeta();
        //                    gamemetaz.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a"));
        //                    ArrayList<String> zLore = new ArrayList<>();
        //                    zLore.add(ChatColor.AQUA.toString());
        //                    zLore.add(ChatColor.AQUA.toString());
        //                    zLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
        //                    zLore.add(ChatColor.AQUA.toString());
        //                    gamemetaz.setLore(zLore);
        //                    Unlockedz.addEnchantment(Enchantment.LUCK, 1);
        //                    Unlockedz.setItemMeta(gamemetaz);
        //                    
        //                    ItemStack Unlockedg = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 2);
        //                    ItemMeta gamemetag = Unlockedg.getItemMeta();
        //                    gamemetag.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a"));
        //                    ArrayList<String> gLore = new ArrayList<>();
        //                    gLore.add(ChatColor.AQUA.toString());
        //                    gLore.add(ChatColor.AQUA.toString());
        //                    gLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
        //                    gLore.add(ChatColor.AQUA.toString());
        //                    gamemetag.setLore(gLore);
        //                    Unlockedg.addEnchantment(Enchantment.LUCK, 1);
        //                    Unlockedg.setItemMeta(gamemetag);
        //                    
        //                    ItemStack Unlockedh = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1);
        //                    ItemMeta gamemetah = Unlockedh.getItemMeta();
        //                    gamemetah.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a"));
        //                    ArrayList<String> hLore = new ArrayList<>();
        //                    hLore.add(ChatColor.AQUA.toString());
        //                    hLore.add(ChatColor.AQUA.toString());
        //                    hLore.add(ChatColor.translateAlternateColorCodes('&', "&7"));
        //                    hLore.add(ChatColor.AQUA.toString());
        //                    gamemetah.setLore(hLore);
        //                    Unlockedh.addEnchantment(Enchantment.DURABILITY, 1);
        //                    Unlockedh.setItemMeta(gamemetah);
                            
                            
                            // dit zal worden altijdworden weergegeven / bij elke tier
          
                            inventory.setItem(0, DetailD);
                            inventory.setItem(1, DetailD);
                            inventory.setItem(2, DetailD);
                            inventory.setItem(3, DetailD);
                            inventory.setItem(5, DetailD);
                            inventory.setItem(6, DetailD);
                            inventory.setItem(7, DetailD);
                            inventory.setItem(8, DetailD);
                            inventory.setItem(9, DetailD);
                            inventory.setItem(10, DetailD);
                            inventory.setItem(11, DetailD);
                            inventory.setItem(12, DetailD);
                            inventory.setItem(13, DetailD);
                            inventory.setItem(14, DetailD);
                            inventory.setItem(15, DetailD);
                            inventory.setItem(16, DetailD);
                            inventory.setItem(17, DetailD);
                            inventory.setItem(18, DetailD);
                            inventory.setItem(19, DetailD);
                            inventory.setItem(21, DetailD);
                            inventory.setItem(23, DetailD);
                            inventory.setItem(25, DetailD);
                            inventory.setItem(26, DetailD);
                            inventory.setItem(27, DetailD);
                            inventory.setItem(28, DetailD);
                            inventory.setItem(29, DetailD);
                            inventory.setItem(30, DetailD);
                            inventory.setItem(31, DetailD);
                            inventory.setItem(32, DetailD);
                            inventory.setItem(33, DetailD);
                            inventory.setItem(34, DetailD);
                            inventory.setItem(35, DetailD);
                            inventory.setItem(36, DetailD);
                            inventory.setItem(37, DetailD);
                            inventory.setItem(38, DetailD);
                            inventory.setItem(40, DetailD);
                            inventory.setItem(42, DetailD);
                            inventory.setItem(43, DetailD);
                            inventory.setItem(44, DetailD);
                            
                            // als je nog geen tier hebt gekocht!
                            
                            inventory.setItem(4, gamemodeS);
                            inventory.setItem(24, gamemodeC);
                            inventory.setItem(41, gamemodeA);
                            inventory.setItem(39, gamemodeSP);
                            inventory.setItem(20, gamemodeQ);
                            inventory.setItem(22, Spawners);
               
    }
  
    }

  }
@EventHandler
public void BlockPlaceEvent(BlockPlaceEvent event) {
    Player player = event.getPlayer();
    Block block = event.getBlockPlaced();
    if (event.getBlock().getState() instanceof CreatureSpawner) {
        if (!player.hasPermission("Spawner.Place")) {
            player.sendMessage(ChatColor.RED + "you don't have permission the permission (Spawner.place)");
            event.setCancelled(true);
        }
    } else {
        return;
        }
}
}



