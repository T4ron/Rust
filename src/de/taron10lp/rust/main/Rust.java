package de.taron10lp.rust.main;

import de.taron10lp.rust.listener.*;
import de.taron10lp.rust.utils.ItemStacks;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Rust extends JavaPlugin {

    public final String PREFIX = "§4[§6Rust§4]§7 ";

    private ItemStacks itemStacks;

    @Override
    public void onEnable() {
        initialize(Bukkit.getPluginManager());
    }

    private void initialize(PluginManager pluginManager) {
        pluginManager.registerEvents(new PlayerJoinListener(this), this);
        pluginManager.registerEvents(new PlayerLeaveListener(this), this);
        pluginManager.registerEvents(new PlayerInteractListener(this), this);
        pluginManager.registerEvents(new PlayerBreakBlockListener(this), this);
        pluginManager.registerEvents(new PlayerPlaceBlockListener(this), this);
        pluginManager.registerEvents(new PlayerPickupItemListener(this), this);
        pluginManager.registerEvents(new BlockDropItemListener(this), this);
        
        itemStacks = new ItemStacks();
    }

    public ItemStacks getItemStacks() {
        return itemStacks;
    }

    public void setItemStacks(ItemStacks itemStacks) {
        this.itemStacks = itemStacks;
    }
}
