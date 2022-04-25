package io.github.kkauaon;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    public Logger logger = getLogger();

    public FileConfiguration config = getConfig();

    public FileConfiguration mensagens;
    public FileConfiguration casas;

    public static Plugin plugin;

    public void setupCasas() {
        File file = new File(getDataFolder(), "homes.yml");

        if (!file.exists()) {
            file.getParentFile().mkdirs();
            saveResource("homes.yml", false);
        }

        casas = new YamlConfiguration();

        try {
            casas.load(file);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public void setupMensagens() {
        File file = new File(getDataFolder(), "messages.yml");
        
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            saveResource("messages.yml", false); 
        }

        mensagens = new YamlConfiguration();

        try {
            mensagens.load(file);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        setupCasas();
        setupMensagens();

        plugin = this;

        getCommand("casas").setExecutor(new CasasCommand());
        getCommand("kcasas").setExecutor(new kCasasCommand());

        logger.info("Plugin kCasas ativado!");
    }
    @Override
    public void onDisable() {
        logger.info("Bye bye!");
    }
}
