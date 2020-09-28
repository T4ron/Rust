package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {

    private Rust plugin;

    public PlayerInteractListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerClickCraftingTable(PlayerInteractEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(!(event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
            return;
        }
        if(!(event.getClickedBlock().getType() == Material.CRAFTING_TABLE)) {
            return;
        }
        event.setCancelled(true);
        player.sendMessage("Interacted");
    }

    @EventHandler
    public void onPlayerClickGambler(PlayerInteractEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(!(event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
            return;
        }
        if(!(event.getClickedBlock().getType() == Material.GRINDSTONE)) {
            return;
        }
        event.setCancelled(true);
        plugin.getInventorys().openGambleInv(player);
    }
}
