package de.taron10lp.rust.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WorkStations {

    public WorkStations() {

    }

    public ItemStack getworkbenchT1() {
        ItemStack workbenchT1 = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta workbenchT1Meta = workbenchT1.getItemMeta();
        workbenchT1Meta.setDisplayName("Werkbank Stufe 1");
        workbenchT1.setItemMeta(workbenchT1Meta);

        return workbenchT1;
    }

    public ItemStack getFurnace() {
        ItemStack furnace = new ItemStack(Material.FURNACE);
        ItemMeta furnaceMeta = furnace.getItemMeta();
        furnaceMeta.setDisplayName("Ofen");
        furnace.setItemMeta(furnaceMeta);

        return furnace;
    }
}
