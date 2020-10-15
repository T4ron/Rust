package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

    private Rust plugin;

    public PlayerDeathListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void handlePlayerDeath(PlayerDeathEvent event) {
        if(!(event.getEntity() instanceof Player)) {
            return;
        }
        Player player = (Player) event.getEntity();


        if(event.getDrops().contains(plugin.getItemStacks().getInvCraftingPlaceHolder())) {
            for(int i=0; i<=event.getDrops().size(); i++) {
                if(event.getDrops().get(i).equals(plugin.getItemStacks().getInvCraftingPlaceHolder())) {
                    event.getDrops().get(i).setType(Material.AIR);
                }
            }
        }

        event.setDeathMessage("");

    }
}
