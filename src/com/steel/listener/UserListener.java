package com.steel.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public class UserListener implements Listener {
    
    @EventHandler
    public void onPlayerJoin(AsyncPlayerPreLoginEvent event) {}

}
