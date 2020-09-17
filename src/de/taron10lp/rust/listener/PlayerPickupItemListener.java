package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerPickupItemListener implements Listener {

    private Rust plugin;

    public PlayerPickupItemListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerPickupItem(PlayerPickupItemEvent event) {
        Bukkit.broadcastMessage("Item pickuped");
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(event.getItem() == null) {
            return;
        }

        if(event.getItem().getType().equals(Material.CACTUS)) {
            event.setCancelled(true);
            event.getItem().remove();
            player.getInventory().addItem(plugin.getItemStacks().getWoodLog(8));
        }

    }

}
