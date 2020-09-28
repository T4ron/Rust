package de.taron10lp.rust.main;

import de.taron10lp.rust.commands.GiveMaterialSpawners;
import de.taron10lp.rust.commands.GiveMaterials;
import de.taron10lp.rust.commands.GiveTools;
import de.taron10lp.rust.commands.GiveWorkStations;
import de.taron10lp.rust.listener.*;
import de.taron10lp.rust.utils.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Rust extends JavaPlugin {

    public final String PREFIX = "§4[§6Rust§4]§7 ";

    private ItemStacks itemStacks;
    private StoneSpawns stoneSpawns;
    private WorkStations workStations;
    private Tools tools;
    private Inventorys inventorys;

    @Override
    public void onEnable() {
        initialize(Bukkit.getPluginManager());

        this.getCommand("givematerialspawner").setExecutor(new GiveMaterialSpawners(this));
        this.getCommand("givetools").setExecutor(new GiveTools(this));
        this.getCommand("givematerials").setExecutor(new GiveMaterials(this));
        this.getCommand("giveworkstations").setExecutor(new GiveWorkStations(this));
    }

    private void initialize(PluginManager pluginManager) {
        pluginManager.registerEvents(new PlayerJoinListener(this), this);
        pluginManager.registerEvents(new PlayerLeaveListener(this), this);
        pluginManager.registerEvents(new PlayerInteractListener(this), this);
        pluginManager.registerEvents(new PlayerBreakBlockListener(this), this);
        pluginManager.registerEvents(new PlayerPlaceBlockListener(this), this);
        pluginManager.registerEvents(new PlayerPickupItemListener(this), this);
        pluginManager.registerEvents(new BlockDropItemListener(this), this);
        pluginManager.registerEvents(new MobSpawnListener(this), this);
        pluginManager.registerEvents(new PlayerSwapHandItemListener(this), this);
        pluginManager.registerEvents(new InventoryClickListener(this), this);

        itemStacks = new ItemStacks();
        stoneSpawns = new StoneSpawns(this);
        workStations = new WorkStations();
        tools = new Tools();
        inventorys = new Inventorys(this);
    }

    public ItemStacks getItemStacks() {
        return itemStacks;
    }
    public void setItemStacks(ItemStacks itemStacks) {
        this.itemStacks = itemStacks;
    }

    public StoneSpawns getStoneSpawns() { return stoneSpawns; }
    public void setStoneSpawns(StoneSpawns stoneSpawns) { this.stoneSpawns = stoneSpawns; }

    public WorkStations getWorkStations() { return workStations; }
    public void setWorkStations(WorkStations workStations) { this.workStations = workStations; }

    public Tools getTools() { return tools; }
    public void setTools(Tools tools) { this.tools = tools; }

    public Inventorys getInventorys() { return inventorys; }
    public void setInventorys(Inventorys inventorys) { this.inventorys = inventorys; }
}
