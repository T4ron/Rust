package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDropItemEvent;

public class BlockDropItemListener implements Listener {

    private Rust plugin;

    public BlockDropItemListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockDropItem(BlockDropItemEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(event.getItems().isEmpty()) {
            return;
        }

        if(event.getBlock().getType().equals(Material.CACTUS)) {
            event.setCancelled(true);
            player.getInventory().addItem(plugin.getItemStacks().getWoodLog(8));
        }

        if(event.getBlock().getType().equals(Material.SUGAR_CANE)) {
            Bukkit.broadcastMessage("Hey imma cactus!");
            event.setCancelled(true);
            player.getInventory().addItem(plugin.getItemStacks().getFiber(8));
        }

    }

}
