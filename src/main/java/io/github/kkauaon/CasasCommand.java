package io.github.kkauaon;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
//import org.bukkit.entity.Player;

public class CasasCommand implements CommandExecutor {
    public FileConfiguration mensagens = Plugin.plugin.mensagens;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        /*if (sender instanceof Player) {
            Player player = (Player) sender;
        }*/

        sender.sendMessage(new String[] {
            ChatColor.translateAlternateColorCodes('&', mensagens.getString("your-homes")),
            ChatColor.translateAlternateColorCodes('&', mensagens.getString("no-homes-set"))
        });
        return true;
    }
}