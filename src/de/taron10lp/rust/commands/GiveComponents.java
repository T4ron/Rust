package de.taron10lp.rust.commands;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class GiveComponents implements CommandExecutor {

    private Rust plugin;

    public GiveComponents(Rust plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if(!(sender instanceof Player)) {
            return true;
        }

        if(player.isOp()) {
            Inventory componentsInv = Bukkit.createInventory(null, InventoryType.CHEST, "All Components");
            for(int i=0; i<=plugin.getItemComponents().getAllItemComponents().size()-1; i++) {
                componentsInv.setItem(i, plugin.getItemComponents().getAllItemComponents().get(i));
            }
            player.openInventory(componentsInv);
        }

        return false;
    }
}
