package de.taron10lp.rust.cratesandbarrels;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Random;

public class BlueBarrel extends Barrel {

    private BarrelManager barrelManager;
    private Rust plugin;

    private ArrayList<ItemStack> loot = new ArrayList<>();

    public BlueBarrel(BarrelManager barrelManager, Rust plugin) {
        this.barrelManager = barrelManager;
        this.plugin = plugin;
    }

    @Override
    public void generateLoot(Player player, Location location, int chance) {
        loot.add(plugin.getItemComponents().getScrap(2));

        Random random = new Random();
        int amount;
        if (chance < 16) { //16 percent chance
            amount = random.nextInt(2) + 1;
            loot.add(plugin.getItemComponents().getRope(amount));
            return;
        } else if (chance < 15) {
            loot.add(plugin.getItemComponents().getMetalBlade(1));
            return;
        } else if (chance < 8) {
            ArrayList<org.bukkit.inventory.ItemStack> percent8Items = new ArrayList<>();
            percent8Items.add(plugin.getItemComponents().getEmptyPropaneTank(1));
            percent8Items.add(plugin.getItemComponents().getTarp(1));
            amount = random.nextInt(4) + 3;
            percent8Items.add(plugin.getItemComponents().getSewingKit(amount));
            int whichItem = random.nextInt(percent8Items.size()) + 1;
            loot.add(percent8Items.get(whichItem));
        } else if (chance < 1) {
            ArrayList<org.bukkit.inventory.ItemStack> percent1Items = new ArrayList<>();
            percent1Items.add(plugin.getItemComponents().getGears(2));
            amount = random.nextInt(3) + 2;
            percent1Items.add(plugin.getItemComponents().getRoadSigns(amount));
            percent1Items.add(plugin.getItemComponents().getSemiAutoBody(1));
            percent1Items.add(plugin.getItemComponents().getSheetMetal(1));
            amount = random.nextInt(4) + 1;
            percent1Items.add(plugin.getItemComponents().getMetalPipe(amount));
            percent1Items.add(plugin.getItemComponents().getElectricFuse(1));
            percent1Items.add(plugin.getItemComponents().getMetalSpring(1));
            //More Items Later from: https://rustlabs.com/entity/barrel#order;sort=3,1,0

            int whichItem = random.nextInt(percent1Items.size()) + 1;
            loot.add(percent1Items.get(whichItem));

            player.sendMessage("opening");
            for(int i=0; i<1;i++) {
                location.getWorld().dropItem(location, loot.get(i));
            }
        }
    }
}
