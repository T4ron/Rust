package de.taron10lp.rust.commands;

import de.taron10lp.rust.main.Rust;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveTools implements CommandExecutor {

    private Rust plugin;

    public GiveTools(Rust plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
        Player player = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("givetools")) {
            if(player.isOp()) {
                if(args.length == 1) {
                    if(args[0].equalsIgnoreCase("rock")) {
                        player.getInventory().addItem(plugin.getTools().getRock());
                    }else if(args[0].equalsIgnoreCase("torch")) {
                        player.getInventory().addItem(plugin.getTools().getTorch());
                    } else {
                        player.sendMessage(plugin.PREFIX + "Dieser Befehl benötigt zusätzlich ein Tool.");
                    }
                } else {
                    player.sendMessage(plugin.PREFIX + "Du musst ein Tool eingeben");
                }
            } else {
                player.sendMessage(plugin.PREFIX + "Du hast keine Berechtigung diesen Befehl zu benutzen");
            }
        }

        return false;
    }
}
