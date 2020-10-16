package de.taron10lp.rust.commands;

import de.taron10lp.rust.main.Rust;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveMaterialSpawners implements CommandExecutor {

    private Rust plugin;

    public GiveMaterialSpawners(Rust plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if(!(sender instanceof Player)) {
            return true;
        }

        if(cmd.getName().equalsIgnoreCase("givematerialspawner")) {
            if (player.isOp()) {
                if(args.length == 1) {
                    if(args[0].equalsIgnoreCase("stone")) {
                        switch(args[0]) {
                            case "stone":
                                player.getInventory().addItem(plugin.getItemMaterials().getStoneSpawner());
                                break;
                        }
                    } else { player.sendMessage(plugin.PREFIX + "Dieser Befehl benötigt zusätzlich einen Ressourcen Typ."); }
                } else { player.sendMessage(plugin.PREFIX + "Dieser Befehl benötigt zusätzlich einen Ressourcen Typ."); }
            } else { player.sendMessage(plugin.PREFIX + "Du hast keine Berechtigung diesen Befehl zu benutzen."); }
        }
    return false;
    }
}
