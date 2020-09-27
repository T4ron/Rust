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
import org.bukkit.scheduler.BukkitRunnable;

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

        if(!(event.getPlayer().getGameMode().equals(GameMode.SURVIVAL))) {
            return;
        }

        ItemStack woodLog = plugin.getItemStacks().getWoodLog(8);
        ItemStack cloth = plugin.getItemStacks().getCloth(8);
        ItemStack stone = plugin.getItemStacks().getStone(8);
        ItemStack ironOre = plugin.getItemStacks().getIronOre(8);
        ItemStack sulfurOre = plugin.getItemStacks().getSulfurOre(8);

        for(Material material : plugin.getItemStacks().getWoodLogTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(woodLog);
            }
        }

        for(Material material : plugin.getItemStacks().getClothTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                event.setCancelled(true);
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(cloth);
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

        for(Material material : plugin.getItemStacks().getIronOreTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                event.setCancelled(true);
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(ironOre);
            }
        }

        for(Material material : plugin.getItemStacks().getSulfurOreTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                event.setCancelled(true);
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(sulfurOre);
            }
        }

        for(Material material : plugin.getItemStacks().getPlacableBlocks()) {
            if(event.getBlock().getType().equals(material)) {
                if(material.equals(Material.FURNACE)) {
                    if(event.getBlock().getLocation().subtract(0, 1, 0).getBlock().getType() == Material.FURNACE) {
                        event.setCancelled(true);
                    }
                    event.setCancelled(true);
                    event.getBlock().getLocation().add(0, 1, 0).getBlock().setType(Material.AIR);
                    event.getBlock().setType(Material.AIR);
                    player.getInventory().addItem(plugin.getWorkStations().getFurnace());
                    return;
                }
            }
        }

        event.setCancelled(true);

    }
}