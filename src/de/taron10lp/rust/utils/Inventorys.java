package de.taron10lp.rust.utils;


import de.taron10lp.rust.main.Rust;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class Inventorys {

    private Rust plugin;

    public Inventorys(Rust plugin) {
        this.plugin = plugin;

    }

    public Inventory getSurvCraftingInv() {
        Inventory surfCraftingInv = Bukkit.createInventory(null, InventoryType.CHEST, "Herstellung");

        ItemStack placeholder = plugin.getItemStacks().getPlaceHolder();

        for(int i=0; i>=8; i++) {
            surfCraftingInv.setItem(i, placeholder);
        }
        for(int i=18; i>=26;i++) {
            surfCraftingInv.setItem(i, placeholder);
        }

        return surfCraftingInv;
    }
    public void openSurvCraftingInv(Player player) {
        player.openInventory(getSurvCraftingInv());
    }

    public Inventory getGamblerInv() {
        Inventory gamblerInv = Bukkit.createInventory(null, InventoryType.CHEST, "Gambler");

        ItemStack placeholder = plugin.getItemStacks().getPlaceHolder();

        for(int i=0; i>=8; i++) {
            gamblerInv.setItem(i, placeholder);
        }
        for(int i=18; i>=26;i++) {
            gamblerInv.setItem(i, placeholder);
        }

        return gamblerInv;
    }
    public void openGambleInv(Player player) {
        player.openInventory(getGamblerInv());
    }
}
