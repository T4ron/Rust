package de.taron10lp.rust.itemstacks;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemComponents {

    private Rust plugin;

    private ArrayList<ItemStack> allItemComponents = new ArrayList<>();

    public ItemComponents(Rust plugin) {
        this.plugin = plugin;

        addComponentToArray(getScrap(1));
        addComponentToArray(getMetalPipe(1));
        addComponentToArray(getSewingKit(1));
        addComponentToArray(getGears(1));
        addComponentToArray(getMetalBlade(1));
        addComponentToArray(getMetalSpring(1));
        addComponentToArray(getRope(1));
        addComponentToArray(getRoadSigns(1));
        addComponentToArray(getRifleBody(1));
        addComponentToArray(getSemiAutoBody(1));
        addComponentToArray(getTarp(1));
        addComponentToArray(getTechTrash(1));
        addComponentToArray(getEmptyPropaneTank(1));
        addComponentToArray(getSheetMetal(1));
        addComponentToArray(getElectricFuse(1));
    }

    public ItemStack getScrap(int amount) {
        ItemStack scrap = new ItemStack(Material.NETHERITE_SCRAP);
        scrap.setAmount(amount);
        ItemMeta scrapMeta = scrap.getItemMeta();
        scrapMeta.setDisplayName("Scrap");
        scrap.setItemMeta(scrapMeta);

        return scrap;
    }
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
        ItemStack metalBlade = new ItemStack(Material.STONE_PRESSURE_PLATE);
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
    public ItemStack getRope(int amount) {
        ItemStack rope = new ItemStack(Material.STRING);
        rope.setAmount(amount);
        ItemMeta ropeMeta = rope.getItemMeta();
        ropeMeta.setDisplayName("Rope");
        rope.setItemMeta(ropeMeta);

        return rope;
    }
    public ItemStack getRoadSigns(int amount) {
        ItemStack roadSigns = new ItemStack(Material.WHITE_BANNER);
        roadSigns.setAmount(amount);
        ItemMeta roadSignsMeta = roadSigns.getItemMeta();
        roadSignsMeta.setDisplayName("Road Signs");
        roadSigns.setItemMeta(roadSignsMeta);

        return roadSigns;
    }
    public ItemStack getRifleBody(int amount) {
        ItemStack rifleBody = new ItemStack(Material.SCUTE);
        rifleBody.setAmount(amount);
        ItemMeta rifleBodyMeta = rifleBody.getItemMeta();
        rifleBodyMeta.setDisplayName("Rifle Body");
        rifleBody.setItemMeta(rifleBodyMeta);

        return rifleBody;
    }
    public ItemStack getSemiAutoBody(int amount) {
        ItemStack semiAutoBody = new ItemStack(Material.MUSIC_DISC_CAT);
        semiAutoBody.setAmount(amount);
        ItemMeta semiAutoBodyMeta = semiAutoBody.getItemMeta();
        semiAutoBodyMeta.setDisplayName("Semi Auto Body");
        semiAutoBody.setItemMeta(semiAutoBodyMeta);

        return semiAutoBody;
    }
    public ItemStack getTarp(int amount) {
        ItemStack tarp = new ItemStack(Material.BLUE_CARPET);
        tarp.setAmount(amount);
        ItemMeta tarpMeta = tarp.getItemMeta();
        tarpMeta.setDisplayName("Tarp");
        tarp.setItemMeta(tarpMeta);

        return tarp;
    }
    public ItemStack getTechTrash(int amount) {
        ItemStack techTrash = new ItemStack(Material.REDSTONE);
        techTrash.setAmount(amount);
        ItemMeta techTrashMeta = techTrash.getItemMeta();
        techTrashMeta.setDisplayName("Tech Trash");
        techTrash.setItemMeta(techTrashMeta);

        return techTrash;
    }
    public ItemStack getEmptyPropaneTank(int amount) {
        ItemStack emptyPropaneTank = new ItemStack(Material.GLASS_BOTTLE);
        emptyPropaneTank.setAmount(amount);
        ItemMeta emptyPropaneTankMeta = emptyPropaneTank.getItemMeta();
        emptyPropaneTankMeta.setDisplayName("Empty Propane Tank");
        emptyPropaneTank.setItemMeta(emptyPropaneTankMeta);

        return emptyPropaneTank;
    }
    public ItemStack getSheetMetal(int amount) {
        ItemStack sheetMetal = new ItemStack(Material.HEAVY_WEIGHTED_PRESSURE_PLATE);
        sheetMetal.setAmount(amount);
        ItemMeta sheetMetalMeta = sheetMetal.getItemMeta();
        sheetMetalMeta.setDisplayName("Sheet Metal");
        sheetMetal.setItemMeta(sheetMetalMeta);

        return sheetMetal;
    }
    public ItemStack getElectricFuse(int amount) {
        ItemStack electricFuse = new ItemStack(Material.DAYLIGHT_DETECTOR);
        electricFuse.setAmount(amount);
        ItemMeta electicFuseMeta = electricFuse.getItemMeta();
        electicFuseMeta.setDisplayName("Electric Fuse");
        electricFuse.setItemMeta(electicFuseMeta);

        return electricFuse;
    }


    public ArrayList<ItemStack> getAllItemComponents() { return allItemComponents; }
    public void addComponentToArray(ItemStack itemStack) { allItemComponents.add(itemStack); }
}
