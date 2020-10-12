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
    public void onPlayerInteract(PlayerInteractEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(!(plugin.getInteractables().contains(event.getMaterial()))) {
            event.setCancelled(true);
            return;
        }

        if(event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            switch(event.getClickedBlock().getType()) {
                case GRINDSTONE:
                    event.setCancelled(true);
                    plugin.getInventorys().openGambleInv(player);
                    break;
                case CRAFTING_TABLE:
                    event.setCancelled(true);
                    player.sendMessage("Interacted");
                    break;
                default:
                    event.setCancelled(true);
                    break;
            }
        }

        event.setCancelled(true);
    }

}
