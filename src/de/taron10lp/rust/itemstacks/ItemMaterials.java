package de.taron10lp.rust.itemstacks;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemMaterials {

    private Rust plugin;

    private ArrayList<Material> woodLogTypes = new ArrayList<>();
    private ArrayList<Material> clothTypes = new ArrayList<>();
    private ArrayList<Material> stoneTypes = new ArrayList<>();
    private ArrayList<Material> ironOreTypes = new ArrayList<>();
    private ArrayList<Material> sulfurOreTypes = new ArrayList<>();
    private ArrayList<Material> placableBlocks = new ArrayList<>();
    private ArrayList<Material> interactables;
    private ArrayList<ItemStack> allItemMaterials = new ArrayList<>();

    public ItemMaterials(Rust plugin) {
        this.plugin = plugin;
        interactables = plugin.getInteractableItems();

        //wood log
        addWoodLogTypes(Material.OAK_LOG);
        addWoodLogTypes(Material.ACACIA_LOG);
        addWoodLogTypes(Material.BIRCH_LOG);
        addWoodLogTypes(Material.DARK_OAK_LOG);
        addWoodLogTypes(Material.JUNGLE_LOG);
        addWoodLogTypes(Material.SPRUCE_LOG);
        addWoodLogTypes(Material.CACTUS);

        //cloth
        addClothTypes(Material.DEAD_BUSH);
        addClothTypes(Material.SUGAR_CANE);
        addClothTypes(Material.SWEET_BERRY_BUSH);

        //stone
        addStoneTypes(Material.STONE);
        addStoneTypes(Material.ANDESITE);
        addStoneTypes(Material.COBBLESTONE);

        //iron ore
        addIronOreTypes(Material.IRON_ORE);

        //sulfur ore
        addSulfurOreTypes(Material.GOLD_ORE);

        //placable blocks
        addPlacableBlocks(Material.CRAFTING_TABLE);
        addPlacableBlocks(Material.FURNACE);

        //allmaterials
        addMaterialToArray(getWoodLog(1));
        addMaterialToArray(getCharcoal(1));
        addMaterialToArray(getCloth(1));
        addMaterialToArray(getStone(1));
        addMaterialToArray(getIronOre(1));
        addMaterialToArray(getIronFrags(1));
        addMaterialToArray(gethqmOre(1));
        addMaterialToArray(gethqmIngot(1));
        addMaterialToArray(getSulfurOre(1));
        addMaterialToArray(getCookedSulfur(1));
        addMaterialToArray(getHumanSkull(1));
        addMaterialToArray(getWolfSkull(1));
    }

    //Ressources
    public ItemStack getWoodLog(int amount) {
        ItemStack woodLog = new ItemStack(Material.OAK_LOG);
        woodLog.setAmount(amount);
        ItemMeta woodLogMeta = woodLog.getItemMeta();
        woodLogMeta.setDisplayName("Wood");
        woodLog.setItemMeta(woodLogMeta);

        return woodLog;
    }
    public ItemStack getCharcoal(int amount) {
        ItemStack charcoal = new ItemStack(Material.CHARCOAL);
        charcoal.setAmount(amount);
        ItemMeta charcoalMeta = charcoal.getItemMeta();
        charcoalMeta.setDisplayName("Charcoal");
        charcoal.setItemMeta(charcoalMeta);

        return charcoal;
    }
    public ItemStack getCloth(int amount) {
        ItemStack fiber = new ItemStack(Material.PAPER);
        fiber.setAmount(amount);
        ItemMeta fiberMeta = fiber.getItemMeta();
        fiberMeta.setDisplayName("Cloth");
        fiber.setItemMeta(fiberMeta);

        return fiber;
    }
    public ItemStack getStone(int amount) {
        ItemStack stone = new ItemStack(Material.STONE);
        stone.setAmount(amount);
        ItemMeta stoneMeta = stone.getItemMeta();
        stoneMeta.setDisplayName("Stone");
        stone.setItemMeta(stoneMeta);

        return stone;
    }
    public ItemStack getIronOre(int amount) {
        ItemStack ironOre = new ItemStack(Material.IRON_ORE);
        ironOre.setAmount(amount);
        ItemMeta ironOreMeta = ironOre.getItemMeta();
        ironOreMeta.setDisplayName("Ironore");
        ironOre.setItemMeta(ironOreMeta);

        return ironOre;
    }
    public ItemStack getIronFrags(int amount) {
        ItemStack ironFrags = new ItemStack(Material.IRON_NUGGET);
        ironFrags.setAmount(amount);
        ItemMeta ironFragsMeta = ironFrags.getItemMeta();
        ironFragsMeta.setDisplayName("Iron Fragments");
        ironFrags.setItemMeta(ironFragsMeta);

        return ironFrags;
    }
    public ItemStack gethqmOre(int amount) {
        ItemStack hqmOre = new ItemStack(Material.ANCIENT_DEBRIS);
        hqmOre.setAmount(amount);
        ItemMeta hqmOreMeta = hqmOre.getItemMeta();
        hqmOreMeta.setDisplayName("High Quality Metal Ore");
        hqmOre.setItemMeta(hqmOreMeta);

        return hqmOre;
    }
    public ItemStack gethqmIngot(int amount) {
        ItemStack hqmIngot = new ItemStack(Material.IRON_INGOT);
        hqmIngot.setAmount(amount);
        ItemMeta hqmIngotMeta = hqmIngot.getItemMeta();
        hqmIngotMeta.setDisplayName("High Quality Metal");
        hqmIngot.setItemMeta(hqmIngotMeta);

        return hqmIngot;
    }
    public ItemStack getSulfurOre(int amount) {
        ItemStack sulfurOre = new ItemStack(Material.GOLD_ORE);
        sulfurOre.setAmount(amount);
        ItemMeta sulfurOreMeta = sulfurOre.getItemMeta();
        sulfurOreMeta.setDisplayName("Sulfur Ore");
        sulfurOre.setItemMeta(sulfurOreMeta);

        return sulfurOre;
    }
    public ItemStack getCookedSulfur(int amount) {
        ItemStack cookedSulfur = new ItemStack(Material.GOLD_INGOT);
        cookedSulfur.setAmount(amount);
        ItemMeta cookedSulfurMeta = cookedSulfur.getItemMeta();
        cookedSulfurMeta.setDisplayName("Cooked Sulfur");
        cookedSulfur.setItemMeta(cookedSulfurMeta);

        return cookedSulfur;
    }
    public ItemStack getHumanSkull(int amount) {
        ItemStack humanSkull = new ItemStack(Material.PLAYER_HEAD);
        humanSkull.setAmount(amount);
        ItemMeta humanSkullMeta = humanSkull.getItemMeta();
        humanSkullMeta.setDisplayName("Human Skull");
        humanSkull.setItemMeta(humanSkullMeta);

        return humanSkull;
    }
    public ItemStack getWolfSkull(int amount) {
        ItemStack wolfSkull = new ItemStack(Material.CREEPER_HEAD);
        wolfSkull.setAmount(amount);
        ItemMeta wolfSkullMeta = wolfSkull.getItemMeta();
        wolfSkullMeta.setDisplayName("Wolf Skull");
        wolfSkull.setItemMeta(wolfSkullMeta);

        return wolfSkull;
    }
    public ItemStack getLowGradeFuel(int amount) {
        ItemStack lowGradeFuel = new ItemStack(Material.CHEST.MILK_BUCKET);
        lowGradeFuel.setAmount(amount);
        ItemMeta lowGradeFuelMeta = lowGradeFuel.getItemMeta();
        lowGradeFuelMeta.setDisplayName("Low Grade Fuel");
        lowGradeFuel.setItemMeta(lowGradeFuelMeta);

        return lowGradeFuel;
    }
    public ItemStack getCrudeOil(int amount) {
        ItemStack crudeOil = new ItemStack(Material.LAVA_BUCKET);
        crudeOil.setAmount(amount);
        ItemMeta crudeOilMeta = crudeOil.getItemMeta();
        crudeOilMeta.setDisplayName("Crude Oil");
        crudeOil.setItemMeta(crudeOilMeta);

        return crudeOil;
    }

    //Materialspawners
    public ItemStack getStoneSpawner() {
        ItemStack stoneSpawner = new ItemStack(Material.WHITE_WOOL);
        ItemMeta stoneSpawnerMeta = stoneSpawner.getItemMeta();
        stoneSpawnerMeta.setDisplayName("Spawner Material: Stone");
        stoneSpawner.setItemMeta(stoneSpawnerMeta);

        return stoneSpawner;
    }

    //ArrayLists
    public ArrayList<Material> getWoodLogTypes() { return woodLogTypes; }
    public void addWoodLogTypes(Material material) {
        woodLogTypes.add(material);
    }

    public ArrayList<Material> getClothTypes() { return clothTypes; }
    public void addClothTypes(Material material) { clothTypes.add(material); }

    public ArrayList<Material> getStoneTypes() { return stoneTypes; }
    public void addStoneTypes(Material material) { stoneTypes.add(material); }

    public ArrayList<Material> getIronOreTypes() { return ironOreTypes; }
    public void addIronOreTypes(Material material) { ironOreTypes.add(material); }

    public ArrayList<Material> getSulfurOreTypes() { return sulfurOreTypes; }
    public void addSulfurOreTypes(Material material) { sulfurOreTypes.add(material); }

    public ArrayList<Material> getPlacableBlocks() { return placableBlocks; }
    public void addPlacableBlocks(Material material) { placableBlocks.add(material); }

    public ArrayList<Material> getInteractables() { return interactables; }
    public void setInteractables(ArrayList<Material> interactables) { this.interactables = interactables; }

    public ArrayList<ItemStack> getAllItemMaterials() { return allItemMaterials; }
    public void addMaterialToArray(ItemStack itemStack) { allItemMaterials.add(itemStack); }
}
