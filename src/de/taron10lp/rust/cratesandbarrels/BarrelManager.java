package de.taron10lp.rust.cratesandbarrels;

import de.taron10lp.rust.main.Rust;

public class BarrelManager {

    private Rust plugin;
    private Barrel[] barrels;

    public BarrelManager(Rust plugin) {
        this.plugin = plugin;
        barrels = new Barrel[3];

        barrels[Barrel.BLUE_BARREL] = new BlueBarrel(this, plugin);
        barrels[Barrel.BROWN_BARREL] = new BrownBarrel(this, plugin);
        barrels[Barrel.RED_BARREL] = new RedBarrel(this, plugin);
    }

}
