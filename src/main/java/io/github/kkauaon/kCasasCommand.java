package io.github.kkauaon;

import java.io.File;
import java.io.IOException;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;

public class kCasasCommand implements CommandExecutor {
    public FileConfiguration mensagens = Plugin.plugin.mensagens;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 0) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a/kcasas reload &7Recarrega as configurações do plugin"));
        } else if (args.length > 0) {
            if (args[0].equalsIgnoreCase("reload")) {
                Plugin.plugin.reloadConfig();
            
                File msgConfig = new File(Plugin.plugin.getDataFolder(), "messages.yml");

                try {
                    Plugin.plugin.mensagens.load(msgConfig);
                } catch (IOException | InvalidConfigurationException e) {
                    e.printStackTrace();
                }

                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', mensagens.getString("reload")));
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', mensagens.getString("unknown-subcommand")));
            }
        }
        

        return true;
    }
}
