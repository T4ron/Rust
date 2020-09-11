package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDropItemEvent;

public class ItemDropListener implements Listener {

    private Rust plugin;

    public ItemDropListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDropItem(BlockDropItemEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(event.getItems() == null) {
            return;
        }
    }

}
