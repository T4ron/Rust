package de.taron10lp.rust.main;

import de.taron10lp.rust.commands.GiveMaterialSpawners;
import de.taron10lp.rust.commands.GiveMaterials;
import de.taron10lp.rust.commands.GiveTools;
import de.taron10lp.rust.commands.GiveWorkStations;
import de.taron10lp.rust.itemstacks.*;
import de.taron10lp.rust.listener.*;
import de.taron10lp.rust.utils.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Rust extends JavaPlugin {

    public final String PREFIX = "§4[§6Rust§4]§7 ";

    private ItemMaterials itemMaterials;
    private ItemStacks itemStacks;
    private WorkStations workStations;
    private Tools tools;
    private Inventorys inventorys;
    private ItemComponents itemComponents;
    private Rust plugin;

    //CustomConfigs
    private File gamblerConfigFile;
    private FileConfiguration gamblerConfig;

    public ArrayList<Material> interactables = new ArrayList<>();

    @Override
    public void onEnable() {
        plugin = this;

        initialize(Bukkit.getPluginManager());

        plugin.saveDefaultConfig();
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

        this.getCommand("givematerialspawner").setExecutor(new GiveMaterialSpawners(this));
        this.getCommand("givetools").setExecutor(new GiveTools(this));
        this.getCommand("givematerials").setExecutor(new GiveMaterials(this));
        this.getCommand("giveworkstations").setExecutor(new GiveWorkStations(this));

        itemMaterials = new ItemMaterials(this);
        itemStacks = new ItemStacks();
        workStations = new WorkStations(this);
        tools = new Tools(this);
        inventorys = new Inventorys(this);
        itemComponents = new ItemComponents();
    }

    //Classes
    public ItemMaterials getItemMaterials() {
        return itemMaterials;
    }
    public void setItemMaterials(ItemMaterials itemMaterials) {
        this.itemMaterials = itemMaterials;
    }

    public ItemStacks getItemStacks() { return itemStacks; }
    public void setItemStacks(ItemStacks itemStacks) { this.itemStacks = itemStacks; }

    public WorkStations getWorkStations() { return workStations; }
    public void setWorkStations(WorkStations workStations) { this.workStations = workStations; }

    public Tools getTools() { return tools; }
    public void setTools(Tools tools) { this.tools = tools; }

    public Inventorys getInventorys() { return inventorys; }
    public void setInventorys(Inventorys inventorys) { this.inventorys = inventorys; }

    public ItemComponents getItemComponents() { return itemComponents; }
    public void setItemComponents(ItemComponents itemComponents) { this.itemComponents = itemComponents; }

    //Custom Configs
    public FileConfiguration getGamblerConfig() { return this.gamblerConfig; }
    private void createGamblerConfig() {
        gamblerConfigFile = new File(getDataFolder(), "gambler.yml");
        if(!(gamblerConfigFile.exists())) {
            gamblerConfigFile.getParentFile().mkdirs();
            saveResource("gambler.yml", false);
        }

        gamblerConfig = new YamlConfiguration();
        try {
            gamblerConfig.load(gamblerConfigFile);
        } catch (IOException | InvalidConfigurationException exception) {
            exception.printStackTrace();
        }
    }

    //ArrayLists
    public ArrayList<Material> getInteractables() { return interactables; }
    public void addInteractable(Material material) {
        interactables.add(material);
    }
}
