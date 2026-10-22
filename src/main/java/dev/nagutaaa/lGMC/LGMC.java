package dev.nagutaaa.lGMC;

import org.bukkit.plugin.java.JavaPlugin;

public final class LGMC extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Enable");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin Disable");
    }
}
