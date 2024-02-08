package md.mirrerror.testduapi;

import md.mirrerror.discordutils.api.DiscordUtilsAPI;
import md.mirrerror.testduapi.commands.discordutils.Test;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginMain extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new MyListener(this), this);
        DiscordUtilsAPI.getCommandsManager().registerSubCommand("discordutils", new Test());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
