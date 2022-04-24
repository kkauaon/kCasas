package io.github.kkauaon;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    public Logger logger = getLogger();

    @Override
    public void onEnable() {
        getCommand("casas").setExecutor(new CasasCommand());
        logger.info("Plugin kCasas ativado!");
    }
    @Override
    public void onDisable() {
        logger.info("Bye bye!");
    }
}
