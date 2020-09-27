package de.taron10lp.rust.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Tools {

    public Tools() {
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
