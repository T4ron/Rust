package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
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
        if(event.getItems() == null) {
            return;
        }
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(event.getBlock().getType().equals(Material.CACTUS)) {
            event.setCancelled(true);
            World world = player.getWorld();
            Location droppedItemLocation = event.getBlock().getLocation();

            world.dropItem(droppedItemLocation, plugin.getItemStacks().getWoodLog(8));
        }
    }

}
