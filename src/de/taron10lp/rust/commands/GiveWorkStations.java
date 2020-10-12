package de.taron10lp.rust.commands;

import de.taron10lp.rust.main.Rust;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveWorkStations implements CommandExecutor {

    private Rust plugin;

    public GiveWorkStations(Rust plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Labler, String[] args) {
        Player player = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("giveworkstations")) {
            if(player.isOp()) {
                if(args.length == 1) {
                    if(args[0].equalsIgnoreCase("workbanktier1")) {
                        player.getInventory().addItem(plugin.getWorkStations().getworkbenchT1());
                    } else if(args[0].equalsIgnoreCase("furnace")) {
                        player.getInventory().addItem(plugin.getWorkStations().getFurnace());
                    } else if(args[0].equalsIgnoreCase("gambler")) {
                        player.getInventory().addItem(plugin.getWorkStations().getGambler());
                    } else if(args[0].equalsIgnoreCase("recycler")) {
                        player.getInventory().addItem(plugin.getWorkStations().getRecycler());
                    } else { player.sendMessage(plugin.PREFIX + "Dieser Befehl benötigt zusätzlich einen Workstation Typ."); }
                } else { player.sendMessage(plugin.PREFIX + "Dieser Befehl benötigt zusätzlich einen Workstation Typ."); }
            } else { player.sendMessage(plugin.PREFIX + "Du hast keine Berechtigung diesen Befehl zu benutzen."); }
        }

        return false;
    }
}
