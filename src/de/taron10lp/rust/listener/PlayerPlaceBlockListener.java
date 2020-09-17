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

        if(!(player.getGameMode() == GameMode.SURVIVAL)) {
            return;
        }

        for(Material material : plugin.getItemStacks().getPlacableBlocks()) {
            if(event.getBlock().getType().equals(material)) {
                return;
            }
        }
        event.setCancelled(true);
    }

}
