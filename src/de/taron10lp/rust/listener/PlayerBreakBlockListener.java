package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.GameMode;
import org.bukkit.Location;
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
    public void onPlayerBreakMaterials(BlockBreakEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        ItemStack woodLog = plugin.getItemStacks().getWoodLog(8);
        ItemStack fiber = plugin.getItemStacks().getFiber(8);
        ItemStack stone = plugin.getItemStacks().getStone(8);

        for(Material material : plugin.getItemStacks().getWoodLogTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                event.setCancelled(true);
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(woodLog);
            }
        }

        for(Material material : plugin.getItemStacks().getFiberTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                event.setCancelled(true);
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(fiber);
            }
        }

        for(Material material : plugin.getItemStacks().getStoneTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                event.setCancelled(true);
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(stone);
            }
        }

        if(player.getGameMode() == GameMode.SURVIVAL) {
            event.setCancelled(true);
        }

    }
}