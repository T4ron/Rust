package de.taron10lp.rust.itemstacks;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Tools {

    private Rust plugin;

    private ArrayList<ItemStack> allItemTools = new ArrayList<>();

    public Tools(Rust plugin) {
        this.plugin = plugin;

        plugin.getInteractableItems().add(getRock().getType());
        plugin.getInteractableItems().add(getTorch().getType());

        addToolToArray(getRock());
        addToolToArray(getTorch());
    }

    public ItemStack getRock() {
        ItemStack rock = new ItemStack(Material.STONE_PICKAXE);
        ItemMeta rockMeta = rock.getItemMeta();
        rockMeta.setDisplayName("Rock");
        rock.setItemMeta(rockMeta);

        return rock;
    }
    public ItemStack getTorch() {
        ItemStack torch = new ItemStack(Material.TORCH);
        ItemMeta torchMeta = torch.getItemMeta();
        torchMeta.setDisplayName("Fackel");
        torch.setItemMeta(torchMeta);

        return torch;
    }

    //ArrayLists

    public ArrayList<ItemStack> getAllItemTools() { return allItemTools; }
    public void addToolToArray(ItemStack itemStack) { allItemTools.add(itemStack); }
}
