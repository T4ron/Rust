package de.taron10lp.rust.utils;


import de.taron10lp.rust.main.Rust;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class Inventorys {

    private Rust plugin;

    public Inventorys(Rust plugin) {
        this.plugin = plugin;

    }

    public Inventory getSurvCraftingInv() {
        Inventory surfCraftingInv = Bukkit.createInventory(null, InventoryType.CHEST, "Craftting");

        return surfCraftingInv;
    }

    public void addItemToSurvcraftingInv(Inventory inventory, ItemStack itemStack, int slot) { inventory.setItem(slot, itemStack); }

}
