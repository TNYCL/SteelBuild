package com.steel.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class UtilMessage {

    public static String color(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static void sendMessage(Player target, String message) {
        target.sendMessage(color(message));
    }

}
