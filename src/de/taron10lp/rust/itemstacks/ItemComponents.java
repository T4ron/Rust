package de.taron10lp.rust.itemstacks;

import de.taron10lp.rust.main.Rust;
import net.minecraft.server.v1_16_R1.Items;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemComponents {

    private Rust plugin;

    public ItemComponents() {}

    public ItemStack getMetalPipe(int amount) {
        ItemStack metalPipe = new ItemStack(Material.BAMBOO);
        metalPipe.setAmount(amount);
        ItemMeta metalPipeMeta = metalPipe.getItemMeta();
        metalPipeMeta.setDisplayName("Metal Pipe");
        metalPipe.setItemMeta(metalPipeMeta);

        return metalPipe;
    }
    public ItemStack getSewingKit(int amount) {
        ItemStack sewingKit = new ItemStack(Material.LEAD);
        sewingKit.setAmount(amount);
        ItemMeta sewingKitMeta = sewingKit.getItemMeta();
        sewingKitMeta.setDisplayName("Sewing Kit");
        sewingKit.setItemMeta(sewingKitMeta);

        return sewingKit;
    }
    public ItemStack getGears(int amount) {
        ItemStack gears = new ItemStack(Material.MUSIC_DISC_11);
        gears.setAmount(amount);
        ItemMeta gearsMeta = gears.getItemMeta();
        gearsMeta.setDisplayName("Gears");
        gears.setItemMeta(gearsMeta);

        return gears;
    }
    public ItemStack getMetalBlade(int amount) {
        ItemStack metalBlade = new ItemStack(Material.MUSIC_DISC_11);
        metalBlade.setAmount(amount);
        ItemMeta metalBladeMeta = metalBlade.getItemMeta();
        metalBladeMeta.setDisplayName("Metal Blade");
        metalBlade.setItemMeta(metalBladeMeta);

        return metalBlade;
    }
    public ItemStack getMetalSpring(int amount) {
        ItemStack metalSpring = new ItemStack(Material.CHAIN);
        metalSpring.setAmount(amount);
        ItemMeta metalSpringMeta = metalSpring.getItemMeta();
        metalSpringMeta.setDisplayName("Metal Spring");
        metalSpring.setItemMeta(metalSpringMeta);

        return metalSpring;
    }
    public ItemStack getMetalSpring(int amount) {
        ItemStack metalSpring = new ItemStack(Material.CHAIN);
        metalSpring.setAmount(amount);
        ItemMeta metalSpringMeta = metalSpring.getItemMeta();
        metalSpringMeta.setDisplayName("Metal Spring");
        metalSpring.setItemMeta(metalSpringMeta);

        return metalSpring;
    }
}
