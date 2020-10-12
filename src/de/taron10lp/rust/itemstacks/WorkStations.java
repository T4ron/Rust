package de.taron10lp.rust.itemstacks;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WorkStations {

    private Rust plugin;

    public WorkStations(Rust plugin) {
        this.plugin = plugin;

        plugin.getInteractables().add(getworkbenchT1().getType());
        plugin.getInteractables().add(getFurnace().getType());
        plugin.getInteractables().add(getGambler().getType());
        plugin.getInteractables().add(getRecycler().getType());
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
    public ItemStack getGambler() {
        ItemStack gambler = new ItemStack(Material.GRINDSTONE);
        ItemMeta gamblerMeta = gambler.getItemMeta();
        gamblerMeta.setDisplayName("Gambler");
        gambler.setItemMeta(gamblerMeta);

        return gambler;
    }
    public ItemStack getRecycler() {
        ItemStack recycler = new ItemStack(Material.SMITHING_TABLE);
        ItemMeta recyclerMeta = recycler.getItemMeta();
        recyclerMeta.setDisplayName("Recycler");
        recycler.setItemMeta(recyclerMeta);

        return recycler;
    }
}
