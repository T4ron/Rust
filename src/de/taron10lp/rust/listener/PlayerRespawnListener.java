package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class PlayerRespawnListener implements Listener {

    private Rust plugin;

    public PlayerRespawnListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        player.getInventory().setItem(0, plugin.getTools().getRock());
        player.getInventory().setItem(1, plugin.getTools().getTorch());
        player.getInventory().setItem(17, plugin.getItemStacks().getInvCraftingPlaceHolder());
    }

}
