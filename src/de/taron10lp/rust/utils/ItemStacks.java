package de.taron10lp.rust.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemStacks {

    private ItemStack woodLog;
    private ArrayList<Material> woodLogTypes = new ArrayList<>();

    public ItemStacks() {
        addWoodLogTypes(Material.OAK_LOG);
        addWoodLogTypes(Material.ACACIA_LOG);
        addWoodLogTypes(Material.BIRCH_LOG);
        addWoodLogTypes(Material.DARK_OAK_LOG);
        addWoodLogTypes(Material.JUNGLE_LOG);
        addWoodLogTypes(Material.SPRUCE_LOG);
        addWoodLogTypes(Material.CACTUS);
    }

    public ItemStack getWoodLog(int amount) {
        ItemStack woodLog = new ItemStack(Material.OAK_LOG);
        woodLog.setAmount(amount);
        ItemMeta woodLogMeta = woodLog.getItemMeta();
        woodLogMeta.setDisplayName("Wood");
        woodLog.setItemMeta(woodLogMeta);

        return woodLog;
    }

    public ArrayList<Material> getWoodLogTypes() { return woodLogTypes; }

    public void addWoodLogTypes(Material material) {
        woodLogTypes.add(material);
    }
}
