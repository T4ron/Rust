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

    //Ressources
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

    public ItemStack getScrap(int amount) {
        ItemStack scrap = new ItemStack(Material.NETHERITE_SCRAP);
        scrap.setAmount(amount);
        ItemMeta scrapMeta = scrap.getItemMeta();
        scrapMeta.setDisplayName("Schrott");
        scrap.setItemMeta(scrapMeta);

        return scrap;
    }

    //Materialspawners
    public ItemStack getStoneSpawner() {
        ItemStack stoneSpawner = new ItemStack(Material.WHITE_WOOL);
        ItemMeta stoneSpawnerMeta = stoneSpawner.getItemMeta();
        stoneSpawnerMeta.setDisplayName("Spawner Material: Stein");
        stoneSpawner.setItemMeta(stoneSpawnerMeta);

        return stoneSpawner;
    }

    //Utils
    public ItemStack getPlaceHolder() {
        ItemStack placeholder = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta placeholderMeta = placeholder.getItemMeta();
        placeholderMeta.setDisplayName(" ");
        placeholder.setItemMeta(placeholderMeta);

        return placeholder;
    }
    public ItemStack getInvCraftingPlaceHolder() {
        ItemStack invCrafttingPlaceholder = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta invCrafttingPlaceholderMeta = invCrafttingPlaceholder.getItemMeta();
        invCrafttingPlaceholderMeta.setDisplayName("Herstellung");
        invCrafttingPlaceholder.setItemMeta(invCrafttingPlaceholderMeta);

        return invCrafttingPlaceholder;
    }
    public ItemStack getSlotBlock() {
        ItemStack slotBlock = new ItemStack(Material.BARRIER);
        ItemMeta slotBlockMeta = slotBlock.getItemMeta();
        slotBlockMeta.setDisplayName("Slot blockiert");
        slotBlock.setItemMeta(slotBlockMeta);

        return slotBlock;
    }

    //Gambler
    public ItemStack get1x() {
        ItemStack gamble1x = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta gamble1xMeta = gamble1x.getItemMeta();
        gamble1xMeta.setDisplayName("Reward: 1x");
        gamble1x.setItemMeta(gamble1xMeta);

        return gamble1x;
    }
    public ItemStack get3x() {
        ItemStack gamble3x = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
        ItemMeta gamble3xMeta = gamble3x.getItemMeta();
        gamble3xMeta.setDisplayName("Reward: 1x");
        gamble3x.setItemMeta(gamble3xMeta);

        return gamble3x;
    }
    public ItemStack get5x() {
        ItemStack gamble5x = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
        ItemMeta gamble5xMeta = gamble5x.getItemMeta();
        gamble5xMeta.setDisplayName("Reward: 1x");
        gamble5x.setItemMeta(gamble5xMeta);

        return gamble5x;
    }
    public ItemStack get10x() {
        ItemStack gamble10x = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
        ItemMeta gamble10xMeta = gamble10x.getItemMeta();
        gamble10xMeta.setDisplayName("Reward: 1x");
        gamble10x.setItemMeta(gamble10xMeta);

        return gamble10x;
    }
    public ItemStack get20x() {
        ItemStack gamble20x = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta gamble20xMeta = gamble20x.getItemMeta();
        gamble20xMeta.setDisplayName("Reward: 1x");
        gamble20x.setItemMeta(gamble20xMeta);

        return gamble20x;
    }
    public ItemStack getStartGamble() {
        ItemStack startGamble = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta startGambleMeta = startGamble.getItemMeta();
        startGambleMeta.setDisplayName("Starte Glücksrad");
        startGamble.setItemMeta(startGambleMeta);

        return startGamble;
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
}
