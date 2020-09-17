package de.taron10lp.rust.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemStacks {

    private ArrayList<Material> woodLogTypes = new ArrayList<>();
    private ArrayList<Material> fiberTypes = new ArrayList<>();
    private ArrayList<Material> stoneTypes = new ArrayList<>();
    private ArrayList<Material> placableBlocks = new ArrayList<>();

    public ItemStacks() {
        addWoodLogTypes(Material.OAK_LOG);
        addWoodLogTypes(Material.ACACIA_LOG);
        addWoodLogTypes(Material.BIRCH_LOG);
        addWoodLogTypes(Material.DARK_OAK_LOG);
        addWoodLogTypes(Material.JUNGLE_LOG);
        addWoodLogTypes(Material.SPRUCE_LOG);
        addWoodLogTypes(Material.CACTUS);

        addFiberTypes(Material.DEAD_BUSH);
        addFiberTypes(Material.SUGAR_CANE);
        addFiberTypes(Material.SWEET_BERRY_BUSH);

        addStoneTypes(Material.STONE);
        addStoneTypes(Material.ANDESITE);
        addStoneTypes(Material.COBBLESTONE);

        addPlacableBlocks(Material.CRAFTING_TABLE);
    }

    public ItemStack getWoodLog(int amount) {
        ItemStack woodLog = new ItemStack(Material.OAK_LOG);
        woodLog.setAmount(amount);
        ItemMeta woodLogMeta = woodLog.getItemMeta();
        woodLogMeta.setDisplayName("Wood");
        woodLog.setItemMeta(woodLogMeta);

        return woodLog;
    }

    public ItemStack getFiber(int amount) {
        ItemStack fiber = new ItemStack(Material.STRING);
        fiber.setAmount(amount);
        ItemMeta fiberMeta = fiber.getItemMeta();
        fiberMeta.setDisplayName("Fiber");
        fiber.setItemMeta(fiberMeta);

        return fiber;
    }

    public ItemStack getStone(int amount) {
        ItemStack stone = new ItemStack(Material.CLAY_BALL);
        stone.setAmount(amount);
        ItemMeta stoneMeta = stone.getItemMeta();
        stoneMeta.setDisplayName("Stone");
        stone.setItemMeta(stoneMeta);

        return stone;
    }

    public ItemStack getInvCraftingItem() {
        ItemStack invCrafttingItem = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta invCrafttingItemMeta = invCrafttingItem.getItemMeta();
        invCrafttingItemMeta.setDisplayName("Craft");
        invCrafttingItem.setItemMeta(invCrafttingItemMeta);

        return invCrafttingItem;
    }

    public ArrayList<Material> getWoodLogTypes() { return woodLogTypes; }
    public void addWoodLogTypes(Material material) {
        woodLogTypes.add(material);
    }

    public ArrayList<Material> getFiberTypes() { return fiberTypes; }
    public void addFiberTypes(Material material) { fiberTypes.add(material); }

    public ArrayList<Material> getStoneTypes() { return stoneTypes; }
    public void addStoneTypes(Material material) { stoneTypes.add(material); }

    public ArrayList<Material> getPlacableBlocks() { return placableBlocks; }
    public void addPlacableBlocks(Material material) { placableBlocks.add(material); }
}
