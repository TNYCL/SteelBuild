package com.steel.util;

import org.bukkit.ChatColor;

public class UtilMessage {

    public static String color(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

}
