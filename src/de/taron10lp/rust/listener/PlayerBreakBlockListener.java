package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

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
        
        ItemStack woodLog = plugin.getItemMaterials().getWoodLog(8);
        ItemStack cloth = plugin.getItemMaterials().getCloth(8);
        ItemStack stone = plugin.getItemMaterials().getStone(8);
        ItemStack ironOre = plugin.getItemMaterials().getIronOre(8);
        ItemStack sulfurOre = plugin.getItemMaterials().getSulfurOre(8);

        for(Material material : plugin.getItemMaterials().getWoodLogTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(woodLog);
            }
        }

        for(Material material : plugin.getItemMaterials().getClothTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                event.setCancelled(true);
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(cloth);
            }
        }

        for(Material material : plugin.getItemMaterials().getStoneTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                event.setCancelled(true);
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(stone);
            }
        }

        for(Material material : plugin.getItemMaterials().getIronOreTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                event.setCancelled(true);
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                Random r = new Random();
                int low = 1,
                    high = 5;
                int result = r.nextInt(high-low) + low;

                if(result == 5) { inventory.addItem(plugin.getItemMaterials().gethqmOre(1)); }

                inventory.addItem(ironOre);
            }
        }

        for(Material material : plugin.getItemMaterials().getSulfurOreTypes()) {
            if(event.getBlock().getType().equals(material)) {
                Block targetBlock = event.getBlock();
                event.setCancelled(true);
                targetBlock.setType(Material.AIR);
                Inventory inventory = player.getInventory();

                inventory.addItem(sulfurOre);
            }
        }

        for(Material material : plugin.getItemMaterials().getPlacableBlocks()) {
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

        for(Material material : plugin.getItemBarrelsAndCrates().getBarrelMaterials()) {
            if(event.getBlock().getType().equals(material)) {
                Random random = new Random();
                int chance = random.nextInt(100);

                if(material.equals(Material.LOOM)) {
                    if (event.getBlock().getLocation().add(0, 1, 0).getBlock().getType() == Material.LOOM) {
                        event.setCancelled(true);
                        event.getBlock().setType(Material.AIR);
                        plugin.getBrownBarrel().generateLoot(player, event.getBlock().getLocation(), chance);
                        event.getBlock().getLocation().add(0, 1, 0).getBlock().setType(Material.AIR);
                        return;
                    } else if (event.getBlock().getLocation().subtract(0, 1, 0).getBlock().getType() == Material.LOOM) {
                        event.setCancelled(true);
                        event.getBlock().setType(Material.AIR);
                        plugin.getBrownBarrel().generateLoot(player, event.getBlock().getLocation(), chance);
                        event.getBlock().getLocation().subtract(0, 1, 0).getBlock().setType(Material.AIR);
                        return;
                    } else { event.setCancelled(true); }
                }
            }
        }

        event.setCancelled(true);
    }
}