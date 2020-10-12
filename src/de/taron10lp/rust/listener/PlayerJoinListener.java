package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    private Rust plugin;

    public PlayerJoinListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage(plugin.PREFIX + player.getDisplayName() + " ist gerade dem Server beigetreten");

        player.getInventory().setItem(17, plugin.getItemMaterials().getInvCraftingPlaceHolder());
    }

}
