package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerJoinListener implements Listener {

    private Rust plugin;

    public PlayerJoinListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage(plugin.PREFIX + player.getDisplayName() + " ist gerade dem Server beigetreten");

        player.getInventory().setMaxStackSize(1000);
        player.getInventory().setItem(17, plugin.getItemStacks().getInvCraftingPlaceHolder());
        player.getInventory().setItem(0, plugin.getTools().getRock());
        player.getInventory().setItem(1, plugin.getTools().getTorch());


        
    }

}
