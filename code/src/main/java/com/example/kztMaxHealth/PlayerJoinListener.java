package com.example.kztMaxHealth;

import org.bukkit.attribute.Attribute;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    private final MaxHealthManager plugin;

    public PlayerJoinListener(MaxHealthManager plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        double defaultHealth = plugin.getDefaultHealth();
        event.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(defaultHealth);
    }
}
