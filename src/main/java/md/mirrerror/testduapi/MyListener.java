package md.mirrerror.testduapi;

import md.mirrerror.discordutils.events.custom.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class MyListener implements Listener {

    private final Plugin plugin;

    public MyListener(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBotGetReady(BotGetReadyEvent event) {
        plugin.getLogger().info("Bot is ready!");
    }

    @EventHandler
    public void onAccountLink(AccountLinkEvent event) {
        plugin.getLogger().info("Account link event!");
    }

    @EventHandler
    public void onAccountUnlink(AccountUnlinkEvent event) {
        plugin.getLogger().info("Account unlink event!");
    }

    @EventHandler
    public void onUserBoostDiscordServer(UserBoostDiscordServerEvent event) {
        plugin.getLogger().info("User boost discord server event!");
    }

    @EventHandler
    public void onUserStopServerBoosting(UserStopBoostingDiscordServerEvent event) {
        plugin.getLogger().info("User stop server boosting event!");
    }

    @EventHandler
    public void onUserFailSecondFactor(UserFailSecondFactorEvent event) {
        plugin.getLogger().info("User fail second factor event!");
    }

    @EventHandler
    public void onUserPassSecondFactor(UserPassSecondFactorEvent event) {
        plugin.getLogger().info("User pass second factor event!");
    }

    @EventHandler
    public void onUserSecondFactorStateChange(UserSecondFactorStateChangeEvent event) {
        plugin.getLogger().info("User second factor state change event!");
    }

}
