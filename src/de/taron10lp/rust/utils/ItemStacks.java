package de.taron10lp.rust.utils;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemStacks {

    private ArrayList<Material> woodLogTypes = new ArrayList<>();
    private ArrayList<Material> clothTypes = new ArrayList<>();
    private ArrayList<Material> stoneTypes = new ArrayList<>();
    private ArrayList<Material> ironOreTypes = new ArrayList<>();
    private ArrayList<Material> sulfurOreTypes = new ArrayList<>();
    private ArrayList<Material> placableBlocks = new ArrayList<>();

    public ItemStacks() {
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
    }

    public ItemStack getWoodLog(int amount) {
        ItemStack woodLog = new ItemStack(Material.OAK_LOG);
        woodLog.setAmount(amount);
        ItemMeta woodLogMeta = woodLog.getItemMeta();
        woodLogMeta.setDisplayName("Holz");
        woodLog.setItemMeta(woodLogMeta);

        return woodLog;
    }
    public ItemStack getCharcoal(int amount) {
        ItemStack charcoal = new ItemStack(Material.CHARCOAL);
        charcoal.setAmount(amount);
        ItemMeta charcoalMeta = charcoal.getItemMeta();
        charcoalMeta.setDisplayName("Holzkohle");
        charcoal.setItemMeta(charcoalMeta);

        return charcoal;
    }

    public ItemStack getCloth(int amount) {
        ItemStack fiber = new ItemStack(Material.PAPER);
        fiber.setAmount(amount);
        ItemMeta fiberMeta = fiber.getItemMeta();
        fiberMeta.setDisplayName("Stoff");
        fiber.setItemMeta(fiberMeta);

        return fiber;
    }

    public ItemStack getStone(int amount) {
        ItemStack stone = new ItemStack(Material.STONE);
        stone.setAmount(amount);
        ItemMeta stoneMeta = stone.getItemMeta();
        stoneMeta.setDisplayName("Stein");
        stone.setItemMeta(stoneMeta);

        return stone;
    }

    public ItemStack getIronOre(int amount) {
        ItemStack ironOre = new ItemStack(Material.IRON_ORE);
        ironOre.setAmount(amount);
        ItemMeta ironOreMeta = ironOre.getItemMeta();
        ironOreMeta.setDisplayName("Eisenerz");
        ironOre.setItemMeta(ironOreMeta);

        return ironOre;
    }
    public ItemStack getIronFrags(int amount) {
        ItemStack ironFrags = new ItemStack(Material.IRON_INGOT);
        ironFrags.setAmount(amount);
        ItemMeta ironFragsMeta = ironFrags.getItemMeta();
        ironFragsMeta.setDisplayName("Eisen Fragmente");
        ironFrags.setItemMeta(ironFragsMeta);

        return ironFrags;
    }

    public ItemStack getSulfurOre(int amount) {
        ItemStack sulfurOre = new ItemStack(Material.GOLD_ORE);
        sulfurOre.setAmount(amount);
        ItemMeta sulfurOreMeta = sulfurOre.getItemMeta();
        sulfurOreMeta.setDisplayName("Sulfurerz");
        sulfurOre.setItemMeta(sulfurOreMeta);

        return sulfurOre;
    }
    public ItemStack getCookedSulfur(int amount) {
        ItemStack cookedSulfur = new ItemStack(Material.GOLD_INGOT);
        cookedSulfur.setAmount(amount);
        ItemMeta cookedSulfurMeta = cookedSulfur.getItemMeta();
        cookedSulfurMeta.setDisplayName("Gekochtes Sulfur");
        cookedSulfur.setItemMeta(cookedSulfurMeta);

        return cookedSulfur;
    }

    public ItemStack getInvCraftingPlaceHolder() {
        ItemStack invCrafttingPlaceholder = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta invCrafttingPlaceholderMeta = invCrafttingPlaceholder.getItemMeta();
        invCrafttingPlaceholderMeta.setDisplayName("Herstellung");
        invCrafttingPlaceholder.setItemMeta(invCrafttingPlaceholderMeta);

        return invCrafttingPlaceholder;
    }

    public ItemStack getStoneSpawner() {
        ItemStack stoneSpawner = new ItemStack(Material.WHITE_WOOL);
        ItemMeta stoneSpawnerMeta = stoneSpawner.getItemMeta();
        stoneSpawnerMeta.setDisplayName("Spawner Material: Stein");
        stoneSpawner.setItemMeta(stoneSpawnerMeta);

        return stoneSpawner;
    }

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
}
