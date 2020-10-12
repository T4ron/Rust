package de.taron10lp.rust.itemstacks;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemComponents {

    private Rust plugin;

    public ItemComponents() {}

    public ItemStack getPipe(int amount) {
        ItemStack pipe = new ItemStack(Material.BAMBOO);
        pipe.setAmount(amount);
        ItemMeta pipeMeta = pipe.getItemMeta();
        pipeMeta.setDisplayName("Pipe");
        pipe.setItemMeta(pipeMeta);

        return pipe;
    }
    public ItemStack getSewingKit(int amount) {
        ItemStack sewingKit = new ItemStack(Material.LEAD);

        return sewingKit;
    }
}
