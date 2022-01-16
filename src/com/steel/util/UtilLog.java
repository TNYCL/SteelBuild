package com.steel.util;

import org.bukkit.Bukkit;

public class UtilLog {

    private static final String logPrefix = "[" + Bukkit.getServer().getName() + "]: ";

    public static void log(String message) {
        System.out.println(logPrefix + message);
    }

}
