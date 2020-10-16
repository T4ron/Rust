package de.taron10lp.rust.commands;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class GiveTools implements CommandExecutor {

    private Rust plugin;

    public GiveTools(Rust plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if(!(sender instanceof Player)) {
            return true;
        }

        if(player.isOp()) {
            Inventory toolInv = Bukkit.createInventory(null, InventoryType.CHEST, "All Tools");
            for(int i=0; i<=plugin.getTools().getAllItemTools().size()-1; i++) {
                toolInv.setItem(i, plugin.getTools().getAllItemTools().get(i));
            }
            player.openInventory(toolInv);
        }

        return false;
    }
}
