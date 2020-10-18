package me.hamburbur.UselessFoods.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class Listeners implements Listener {
    @EventHandler
    public void creatureSpawn(PlayerItemConsumeEvent event) {

        if (event.getItem().getType().name().toLowerCase().contains("potion")){
            return;
        }
        if (event.getItem().getType().name().toLowerCase().contains("bucket")){
            return;
        }
        event.getPlayer().setHealth(0.5);

    }
}
