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
        Inventory survCraftingInv = Bukkit.createInventory(null, InventoryType.CHEST, "Herstellung");

        return survCraftingInv;
    }
    public void openSurvCraftingInv(Player player) {
        ItemStack placeholder = plugin.getItemStacks().getPlaceHolder();
        Inventory survCraftingInv = getSurvCraftingInv();

        for(int i=0; i>=8; i++) {
            survCraftingInv.setItem(i, placeholder);
        }
        for(int i=18; i>=26;i++) {
            survCraftingInv.setItem(i, placeholder);
        }

        player.openInventory(getSurvCraftingInv());
    }

    public Inventory getGamblerInv() {
        Inventory gamblerInv = Bukkit.createInventory(null, InventoryType.CHEST, "Gambler");

        return gamblerInv;
    }
    public void openGambleInv(Player player) {
        ItemStack placeholder = plugin.getItemStacks().getPlaceHolder();
        Inventory gamblerInv = getGamblerInv();

        for(int i=0; i>=8; i++) {
            gamblerInv.setItem(i, placeholder);
        }
        for(int i=18; i>=26;i++) {
            gamblerInv.setItem(i, placeholder);
        }

        gamblerInv.setItem(9, plugin.getItemStacks().get1x());
        gamblerInv.setItem(10, plugin.getItemStacks().get3x());
        gamblerInv.setItem(11, plugin.getItemStacks().get5x());
        gamblerInv.setItem(12, plugin.getItemStacks().get10x());
        gamblerInv.setItem(13, plugin.getItemStacks().get20x());
        gamblerInv.setItem(17, plugin.getItemStacks().getStartGamble());

        player.openInventory(getGamblerInv());
    }
}
