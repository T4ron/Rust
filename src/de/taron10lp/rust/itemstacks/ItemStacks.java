package de.taron10lp.rust.itemstacks;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemStacks {

    public ItemStacks() {}

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
        invCrafttingPlaceholderMeta.setDisplayName("Crafting");
        invCrafttingPlaceholder.setItemMeta(invCrafttingPlaceholderMeta);

        return invCrafttingPlaceholder;
    }
    public ItemStack getSlotBlock() {
        ItemStack slotBlock = new ItemStack(Material.BARRIER);
        ItemMeta slotBlockMeta = slotBlock.getItemMeta();
        slotBlockMeta.setDisplayName("Slot blocked");
        slotBlock.setItemMeta(slotBlockMeta);

        return slotBlock;
    }
    public ItemStack getNothing() {
        ItemStack nothing = new ItemStack(Material.AIR);

        return nothing;
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
        gamble3xMeta.setDisplayName("Reward: 3x");
        gamble3x.setItemMeta(gamble3xMeta);

        return gamble3x;
    }
    public ItemStack get5x() {
        ItemStack gamble5x = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
        ItemMeta gamble5xMeta = gamble5x.getItemMeta();
        gamble5xMeta.setDisplayName("Reward: 5x");
        gamble5x.setItemMeta(gamble5xMeta);

        return gamble5x;
    }
    public ItemStack get10x() {
        ItemStack gamble10x = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
        ItemMeta gamble10xMeta = gamble10x.getItemMeta();
        gamble10xMeta.setDisplayName("Reward: 10x");
        gamble10x.setItemMeta(gamble10xMeta);

        return gamble10x;
    }
    public ItemStack get20x() {
        ItemStack gamble20x = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta gamble20xMeta = gamble20x.getItemMeta();
        gamble20xMeta.setDisplayName("Reward: 20x");
        gamble20x.setItemMeta(gamble20xMeta);

        return gamble20x;
    }
    public ItemStack getStartGamble() {
        ItemStack startGamble = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta startGambleMeta = startGamble.getItemMeta();
        startGambleMeta.setDisplayName("Start Gambling");
        startGamble.setItemMeta(startGambleMeta);

        return startGamble;
    }

}
