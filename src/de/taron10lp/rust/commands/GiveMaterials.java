package de.taron10lp.rust.commands;

import de.taron10lp.rust.main.Rust;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveMaterials implements CommandExecutor {

    private Rust plugin;

    public GiveMaterials(Rust plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
        Player player = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("givematerials")) {
            if(player.isOp()) {
                if(args.length == 1) {
                    if(args[0].equalsIgnoreCase("wood")) {
                        player.getInventory().addItem(plugin.getItemMaterials().getWoodLog(1));
                    } else if(args[0].equalsIgnoreCase("charcoal")) {
                        player.getInventory().addItem(plugin.getItemMaterials().getCharcoal(1));
                    } else if(args[0].equalsIgnoreCase("cloth")) {
                        player.getInventory().addItem(plugin.getItemMaterials().getCloth(1));
                    } else if(args[0].equalsIgnoreCase("stone")) {
                        player.getInventory().addItem(plugin.getItemMaterials().getStone(1));
                    } else if(args[0].equalsIgnoreCase("ironore")) {
                        player.getInventory().addItem(plugin.getItemMaterials().getIronOre(1));
                    } else if(args[0].equalsIgnoreCase("ironfargs")) {
                        player.getInventory().addItem(plugin.getItemMaterials().getIronFrags(1));
                    } else if(args[0].equalsIgnoreCase("sulfurore")) {
                        player.getInventory().addItem(plugin.getItemMaterials().getSulfurOre(1));
                    } else if(args[0].equalsIgnoreCase("cookedsulfur")) {
                        player.getInventory().addItem(plugin.getItemMaterials().getCookedSulfur(1));
                    } else if(args[0].equalsIgnoreCase("all")) {
                        player.getInventory().addItem(plugin.getItemMaterials().getWoodLog(1));
                        player.getInventory().addItem(plugin.getItemMaterials().getCharcoal(1));
                        player.getInventory().addItem(plugin.getItemMaterials().getCloth(1));
                        player.getInventory().addItem(plugin.getItemMaterials().getStone(1));
                        player.getInventory().addItem(plugin.getItemMaterials().getIronOre(1));
                        player.getInventory().addItem(plugin.getItemMaterials().getIronFrags(1));
                        player.getInventory().addItem(plugin.getItemMaterials().getSulfurOre(1));
                        player.getInventory().addItem(plugin.getItemMaterials().getCookedSulfur(1));
                    } else { player.sendMessage(plugin.PREFIX + "Dieser Befehl benötigt zusätzlich einen Ressourcen Typ oder all."); }
                } else { player.sendMessage(plugin.PREFIX + "Dieser Befehl benötigt zusätzlich einen Ressourcen Typ oder all."); }
            } else { player.sendMessage(plugin.PREFIX + "Du hast keine Berechtigung diesen Befehl zu benutzen."); }
        }

        return false;
    }
}