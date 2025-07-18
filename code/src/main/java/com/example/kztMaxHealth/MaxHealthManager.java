package com.example.kztMaxHealth;

import org.bukkit.plugin.java.JavaPlugin;

public class MaxHealthManager extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getCommand("sethealth").setExecutor(new SetHealthCommand(this));
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(this), this);
    }

    public double getDefaultHealth() {
        return getConfig().getDouble("default-health", 40.0);
    }
}
