package de.taron10lp.rust.cratesandbarrels;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public abstract class Barrel {
    
    public static final int BLUE_BARREL = 0,
                            BROWN_BARREL = 1,
                            RED_BARREL = 2;

    public abstract void generateLoot(Player player, Location location, int chance);
}
