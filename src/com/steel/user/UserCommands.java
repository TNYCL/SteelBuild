package com.steel.user;

import com.steel.Settings;
import com.steel.util.UtilPlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UserCommands implements CommandExecutor {

    public static void informationMessage(Player target) {
        UtilPlayer.sendMessage(target, "&e&l           ------ &6&lÜye Sistemi &e&l------");
        UtilPlayer.sendMessage(target, " &6/user add <isim> &f- &eSunucuya üye ekler.");
        UtilPlayer.sendMessage(target, " &6/user setrank <isim> <rank> &f- &eÜyenin yetkisini belirler.");
        UtilPlayer.sendMessage(target, " &6/user setdiscord <isim> <id> &f- &eÜyenin discord'unu belirler.");
        UtilPlayer.sendMessage(target, " &6/user delete <isim> &f- &eÜyeyi siler.");
        UtilPlayer.sendMessage(target, " &6/user list &f- &eKayıtlı üyeleri listeler.");
        UtilPlayer.sendMessage(target, "&e&l           ------ &6&lÜye Sistemi &e&l------");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(!Settings.isAuthorized(player.getName())) return true;
            if(args.length == 0) {
                informationMessage(player);
            } else if(args[0].equalsIgnoreCase("add") || args[0].equalsIgnoreCase("ekle")) {
                if(args.length != 1) {
                    String userName = args[1];
                    SubUserCommands.add(player, userName);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("setrank")) {
                if(args.length != 2) {
                    String rank = args[2];
                    String userName = args[1];
                    SubUserCommands.setRank(player, userName, rank);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("setdiscord")) {
                if(args.length != 2) {
                    String discord = args[2];
                    String userName = args[1];
                    SubUserCommands.setDiscord(player, userName, discord);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("delete")) {
                if(args.length != 1) {
                    String userName = args[1];
                    SubUserCommands.delete(player, userName);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("list")) {
                SubUserCommands.list(player);
            } else {
                informationMessage(player);
            }
        }
        return false;
    }

}
