package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerSwapHandItemListener implements Listener {

    private Rust plugin;

    public PlayerSwapHandItemListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerSwapHanditem(PlayerSwapHandItemsEvent event) {
        event.setCancelled(true);
    }

}
