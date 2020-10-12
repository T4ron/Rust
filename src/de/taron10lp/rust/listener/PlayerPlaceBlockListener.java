package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlayerPlaceBlockListener implements Listener {

    private Rust plugin;

    public PlayerPlaceBlockListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerPlaceBlock(BlockPlaceEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(event.getItemInHand().getItemMeta().getDisplayName().equals(plugin.getItemMaterials().getStoneSpawner().getItemMeta().getDisplayName())) {
            if(player.isOp() == true) {
            } else {
                event.setCancelled(true);
                event.getItemInHand().setType(Material.AIR);
            }
        }

        //Only non-admin items
        if(!(player.getGameMode() == GameMode.SURVIVAL)) {
            return;
        }

        for(Material material : plugin.getItemMaterials().getPlacableBlocks()) {
            if(event.getBlock().getType().equals(material)) {
                if(material.equals(Material.FURNACE)) {
                    if(!(event.getBlock().getLocation().add(0, 1, 0).getBlock().getType() == Material.AIR)) {
                        event.setCancelled(true);
                        player.sendMessage(plugin.PREFIX + "Über dem Ofen darf kein Block sein.");
                        return;
                    }
                    if(event.getBlock().getLocation().subtract(0, 1, 0).getBlock().getType() == Material.AIR) {
                        event.setCancelled(true);
                        player.sendMessage(plugin.PREFIX + "Du musst den Ofen auf einem Bodem platzieren.");
                        return;
                    }
                    event.getBlock().getLocation().add(0 , 1, 0).getBlock().setType(Material.POLISHED_ANDESITE);
                }
                return;
            }
        }

        event.setCancelled(true);
    }

}
