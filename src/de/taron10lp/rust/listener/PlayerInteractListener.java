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
    public void onPlayerInteractCraftingTable(PlayerInteractEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(!(event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
            return;
        }
        if(!(event.getClickedBlock().getType().equals(Material.CRAFTING_TABLE))) {
            return;
        }
        event.setCancelled(true);
        player.sendMessage("Interacting with Workbench Tier 1");
    }

    @EventHandler
    public void onPlayerInteractGambler(PlayerInteractEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(!(event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
            return;
        }
        if(!(event.getClickedBlock().getType().equals(Material.GRINDSTONE))) {
            return;
        }
        event.setCancelled(true);
        player.openInventory(plugin.getInventorys().getGamblerInv());
    }

    @EventHandler
    public void onPlayerUseItem(PlayerInteractEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();
        if(player.isOp()) {
            return;
        }

        if(!(event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR)) {
            return;
        }
        if(!(plugin.getInteractableItems().contains(event.getItem().getType()))) {
            event.setCancelled(true);
            return;
        }
        event.setCancelled(true);
        player.sendMessage("Interacted with: " + event.getItem().getType().toString());
    }

}
