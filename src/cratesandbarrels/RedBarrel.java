package cratesandbarrels;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
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
    public void open(Player player) {
        player.sendMessage("opening");
        generateLoot(player);
    }
    @Override
    public void generateLoot(Player player) {
        Inventory lootInv = Bukkit.createInventory(null, InventoryType.CHEST, "Loot");
        lootInv.addItem(plugin.getItemMaterials().getLowGradeFuel(5));
        lootInv.addItem(plugin.getItemMaterials().getCrudeOil(15));
    }

}
