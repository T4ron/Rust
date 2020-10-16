package de.taron10lp.rust.listener;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerPickupItemListener implements Listener {

    private Rust plugin;

    public PlayerPickupItemListener(Rust plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerPickupItem(PlayerPickupItemEvent event) {
        if(event.getItem() == null) {
            return;
        }
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();
        ItemStack itemStack = (ItemStack) event.getItem().getItemStack();

        if(!(event.getItem().getType().equals(EntityType.DROPPED_ITEM))) {
            return;
        }
        if(itemStack.getType().equals(Material.CACTUS)) {
            for(int i = 0; i<itemStack.getAmount(); i++) {
                player.getInventory().addItem(plugin.getItemMaterials().getWoodLog(8));
                event.setCancelled(true);
                event.getItem().remove();
            }
        }

        if(itemStack.getType().equals(Material.SUGAR_CANE)) {
            for(int i = 0; i<itemStack.getAmount(); i++) {
                player.getInventory().addItem(plugin.getItemMaterials().getCloth(8));
                event.setCancelled(true);
                event.getItem().remove();
            }
        }
        if(itemStack.equals(plugin.getItemStacks().getInvCraftingPlaceHolder())) {
            event.setCancelled(true);
            event.getItem().remove();
        }

    }
}
