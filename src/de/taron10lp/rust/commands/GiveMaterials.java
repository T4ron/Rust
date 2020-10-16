package de.taron10lp.rust.commands;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class GiveMaterials implements CommandExecutor {

    private Rust plugin;

    public GiveMaterials(Rust plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if(!(sender instanceof Player)) {
            return true;
        }

        if(player.isOp()) {
            Inventory materialInv = Bukkit.createInventory(null, InventoryType.CHEST, "All Materials");
            for(int i=0; i<=plugin.getItemMaterials().getAllItemMaterials().size()-1; i++) {
                materialInv.setItem(i, plugin.getItemMaterials().getAllItemMaterials().get(i));
            }
            player.openInventory(materialInv);
        }

        return false;
    }
}