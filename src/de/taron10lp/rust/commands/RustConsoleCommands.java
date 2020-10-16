package de.taron10lp.rust.commands;

import de.taron10lp.rust.main.Rust;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RustConsoleCommands implements CommandExecutor {

    private Rust plugin;

    public RustConsoleCommands(Rust plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if(!(sender instanceof Player)) {
            return true;
        }

        if(args.length == 1) {
            if(args[0].equalsIgnoreCase("kill")) {
                player.setHealth(0);
                player.sendMessage(plugin.CONSOLE_PREFIX + "§ekill");
            }
        }

        return false;
    }
}
