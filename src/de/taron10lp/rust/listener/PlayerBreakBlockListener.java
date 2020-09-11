package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PlayerBreakBlockListener implements Listener {

    private Rust plugin;

    public PlayerBreakBlockListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerBreakWoodlog(BlockBreakEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        ItemStack woodLog = plugin.getItemStacks().getWoodLog(8);

        for(Material material : plugin.getItemStacks().getWoodLogTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                event.setCancelled(true);
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(woodLog);
            }
        }
    }
}
//105