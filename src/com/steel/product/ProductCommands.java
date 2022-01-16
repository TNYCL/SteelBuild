package com.steel.product;

import com.steel.Settings;
import com.steel.util.UtilPlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ProductCommands implements CommandExecutor {

    public static void informationMessage(Player target) {
        UtilPlayer.sendMessage(target, "&e&l           ------ &6&lProje Sistemi &e&l------");
        if(Settings.isAuthorized(target.getName())) {
            UtilPlayer.sendMessage(target, " &6/proje create <proje> &f- &eProje oluşturur.");
            UtilPlayer.sendMessage(target, " &6/proje settheme <proje> <tema> &f- &eProjenin temasını belirler.");
            UtilPlayer.sendMessage(target, " &6/proje setsubject <proje> <konu> &f- &eProjenin konusunu belirler.");
            UtilPlayer.sendMessage(target, " &6/proje setdeadline <proje> <süre> &f- &eProjenin süresini belirler.");
            UtilPlayer.sendMessage(target, " &6/proje setprice <proje> <fiyat> &f- &eProjenin fiyatını belirler.");
            UtilPlayer.sendMessage(target, " &6/proje setbuilder <proje> <mimar> &f- &eProjenin mimarını belirler.");
            UtilPlayer.sendMessage(target, " &6/proje setfinished <proje> &f- &eProjeyi tamamlandı olarak işaretler.");
            UtilPlayer.sendMessage(target, " &6/proje download <proje> &f- &eProjenin haritasını sunucudan indirir.");
            UtilPlayer.sendMessage(target, " &6/proje upload <proje> <link> &f- &eProjenin haritasını sunucuya yükler.");
            UtilPlayer.sendMessage(target, " &6/proje delete <proje> &f- &eProjeyi siler.");
            UtilPlayer.sendMessage(target, " &6/proje list &f- &eBütün projeleri listeler.");
        }
        UtilPlayer.sendMessage(target, " &6/proje tp <proje> &f- &eProje dünyasına ışınlanır.");
        UtilPlayer.sendMessage(target, " &6/proje finish <proje> &f- &eProjenin tamamlandığına dair yetkiliye mesaj gönderir.");
        UtilPlayer.sendMessage(target, " &6/proje info <proje> &f- &eSize ait olan projenin detaylarını gösterir.");
        UtilPlayer.sendMessage(target, "&e&l           ------ &6&lProje Sistemi &e&l------");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length == 0) {
                informationMessage(player);
            } else if(args[0].equalsIgnoreCase("oluştur") || args[0].equalsIgnoreCase("create")) {
                if(args.length != 1) {
                    String projectName = args[1];
                    SubProductCommands.create(player, projectName);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("settheme")) {
                if(args.length != 2) {
                    String theme = args[2];
                    String projectName = args[1];
                    SubProductCommands.setTheme(player, projectName, theme);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("setsubject")) {
                if(args.length != 2) {
                    String subject = args[2];
                    String projectName = args[1];
                    SubProductCommands.setSubject(player, projectName, subject);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("setdeadline")) {
                if(args.length != 2) {
                    long deadline = Long.parseLong(args[2]);
                    String projectName = args[1];
                    SubProductCommands.setDeadline(player, projectName, deadline);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("setprice")) {
                if(args.length != 2) {
                    int price = Integer.parseInt(args[2]);
                    String projectName = args[1];
                    SubProductCommands.setPrice(player, projectName, price);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("setbuilder")) {
                if(args.length != 2) {
                    String builder = args[2];
                    String projectName = args[1];
                    SubProductCommands.setBuilder(player, projectName, builder);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("setfinished")) {
                if(args.length != 1) {
                    String projectName = args[1];
                    SubProductCommands.setFinished(player, projectName);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("download")) {
                if(args.length != 1) {
                    String projectName = args[1];
                    SubProductCommands.download(player, projectName);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("upload")) {
                if(args.length != 2) {
                    String link = args[2];
                    String projectName = args[1];
                    SubProductCommands.upload(player, projectName, link);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("delete")) {
                if(args.length != 1) {
                    String projectName = args[1];
                    SubProductCommands.delete(player, projectName);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("list")) {
                SubProductCommands.list(player);
            } else if(args[0].equalsIgnoreCase("tp")) {
                if(args.length != 1) {
                    String projectName = args[1];
                    SubProductCommands.teleport(player, projectName);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("finish")) {
                if(args.length != 1) {
                    String projectName = args[1];
                    SubProductCommands.finish(player, projectName);
                } else informationMessage(player);
            } else if(args[0].equalsIgnoreCase("info")) {
                if(args.length != 1) {
                    String projectName = args[1];
                    SubProductCommands.info(player, projectName);
                } else informationMessage(player);
            } else {
                informationMessage(player);
            }
        }
        return false;
    }

}
