package cratesandbarrels;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class RedBarrel extends Barrel {

    private BarrelManager barrelManager;
    private Rust plugin;

    private ArrayList<ItemStack> loot = new ArrayList<>();

    public RedBarrel(BarrelManager barrelManager, Rust plugin) {
        this.barrelManager = barrelManager;
        this.plugin = plugin;
    }

    @Override
    public void dropLoot(Player player, Location location) {
        player.sendMessage("opening");

        for(int i=0; i<1;i++) {
            location.getWorld().dropItem(location, loot.get(i));
        }
    }
    @Override
    public void generateLoot(Player player) {
        loot.add(plugin.getItemMaterials().getLowGradeFuel(5));
        loot.add(plugin.getItemMaterials().getCrudeOil(15));
    }

}
