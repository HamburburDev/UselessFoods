package me.hamburbur.UselessFoods;

import me.hamburbur.UselessFoods.listeners.Listeners;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main instance;

    public static Main getInstance(){
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("UselessFoods is now starting...");

        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        instance = null;
        getLogger().info("UselessFoods is now stopping...");
    }
}
