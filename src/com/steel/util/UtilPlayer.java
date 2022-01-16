package com.steel.util;

import org.bukkit.entity.Player;

public class UtilPlayer {

    public static void sendMessage(Player target, String message) {
        target.sendMessage(UtilMessage.color(message));
    }

}
