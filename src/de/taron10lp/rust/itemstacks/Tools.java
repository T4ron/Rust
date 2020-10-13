package de.taron10lp.rust.itemstacks;

import de.taron10lp.rust.main.Rust;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Tools {

    private Rust plugin;

    public Tools(Rust plugin) {
        this.plugin = plugin;

        plugin.getInteractables().add(getRock().getType());
        plugin.getInteractables().add(getTorch().getType());
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
}
