package de.taron10lp.rust.main;

import de.taron10lp.rust.cratesandbarrels.BarrelManager;
import de.taron10lp.rust.cratesandbarrels.BlueBarrel;
import de.taron10lp.rust.cratesandbarrels.BrownBarrel;
import de.taron10lp.rust.cratesandbarrels.RedBarrel;
import de.taron10lp.rust.commands.*;
import de.taron10lp.rust.itemstacks.*;
import de.taron10lp.rust.listener.*;
import de.taron10lp.rust.utils.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Rust extends JavaPlugin {

    public final String PREFIX = "§4[§6Rust§4]§7 ",
                        CONSOLE_PREFIX = "§econsole.";

    //Classes
    private ItemMaterials itemMaterials;
    private ItemStacks itemStacks;
    private WorkStations workStations;
    private Tools tools;
    private Inventorys inventorys;
    private ItemComponents itemComponents;
    private ItemBarrelsAndCrates itemBarrelsAndCrates;
    private BarrelManager barrelManager;

    //Barrels And Crates
    private BlueBarrel blueBarrel;
    private BrownBarrel brownBarrel;
    private RedBarrel redBarrel;

    //CustomConfigs
    private File gamblerConfigFile = new File("plugins/Rust", "gambler.yml");
    private FileConfiguration gamblerConfig = YamlConfiguration.loadConfiguration(gamblerConfigFile);

    //ArrayLists
    public ArrayList<Material> interactableItems = new ArrayList<>();

    @Override
    public void onEnable() {
        initialize(Bukkit.getPluginManager());
        initializeConfigs();
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
        pluginManager.registerEvents(new InventoryClickListener(this), this);
        pluginManager.registerEvents(new PlayerDeathListener(this), this);
        pluginManager.registerEvents(new PlayerRespawnListener(this), this);

        this.getCommand("givematerialspawner").setExecutor(new GiveMaterialSpawners(this));
        this.getCommand("givetools").setExecutor(new GiveTools(this));
        this.getCommand("givematerials").setExecutor(new GiveMaterials(this));
        this.getCommand("giveworkstations").setExecutor(new GiveWorkStations(this));
        this.getCommand("console").setExecutor(new RustConsoleCommands(this));
        this.getCommand("givecomponents").setExecutor(new GiveComponents(this));

        itemMaterials = new ItemMaterials(this);
        itemStacks = new ItemStacks();
        workStations = new WorkStations(this);
        tools = new Tools(this);
        inventorys = new Inventorys(this);
        itemComponents = new ItemComponents(this);
        itemBarrelsAndCrates = new ItemBarrelsAndCrates(this);
        barrelManager = new BarrelManager(this);

        blueBarrel = new BlueBarrel(barrelManager, this);
        brownBarrel = new BrownBarrel(barrelManager, this);
        redBarrel = new RedBarrel(barrelManager, this);
    }

    private void initializeConfigs() {
        saveConfig();

        createGamblerConfig();
        saveGamblerConfig();
    }

    //Classes
    public ItemMaterials getItemMaterials() {
        return itemMaterials;
    }
    public ItemStacks getItemStacks() { return itemStacks; }
    public WorkStations getWorkStations() { return workStations; }
    public Tools getTools() { return tools; }
    public Inventorys getInventorys() { return inventorys; }
    public ItemComponents getItemComponents() { return itemComponents; }
    public ItemBarrelsAndCrates getItemBarrelsAndCrates() { return itemBarrelsAndCrates; }

    //Crates And Barrels
    public BlueBarrel getBlueBarrel() { return blueBarrel; }
    public BrownBarrel getBrownBarrel() { return brownBarrel; }
    public RedBarrel getRedBarrel() { return redBarrel; }

    //Custom Configs
    public FileConfiguration getGamblerConfig() { return this.gamblerConfig; }
    private void createGamblerConfig() {
        if(!getDataFolder().exists())
            getDataFolder().mkdirs();
    }
    public void saveGamblerConfig() {
        try { gamblerConfig.save("gambler.yml"); } catch (IOException exception) { exception.printStackTrace(); }
    }

    //ArrayLists
    public ArrayList<Material> getInteractableItems() { return interactableItems; }
    public void addInteractableItem(Material material) {
        interactableItems.add(material);
    }
}
