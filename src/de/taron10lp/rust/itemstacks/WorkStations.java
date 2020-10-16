package de.taron10lp.rust.itemstacks;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class WorkStations {

    private Rust plugin;

    private ArrayList<ItemStack> allItemWorkStations = new ArrayList<>();

    public WorkStations(Rust plugin) {
        this.plugin = plugin;

        plugin.getInteractableItems().add(getworkbenchT1().getType());
        plugin.getInteractableItems().add(getFurnace().getType());
        plugin.getInteractableItems().add(getGambler().getType());
        plugin.getInteractableItems().add(getRecycler().getType());

        addWorkStationToArray(getworkbenchT1());
        addWorkStationToArray(getFurnace());
        addWorkStationToArray(getGambler());
        addWorkStationToArray(getRecycler());
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

    public ArrayList<ItemStack> getAllItemWorkStations() { return allItemWorkStations; }
    public void addWorkStationToArray(ItemStack itemStack) { allItemWorkStations.add(itemStack); }
}
