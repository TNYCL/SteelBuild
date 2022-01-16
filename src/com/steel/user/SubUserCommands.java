package com.steel.user;

import com.steel.Main;
import com.steel.user.enums.Rank;
import com.steel.user.module.User;
import com.steel.util.UtilPlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

public class SubUserCommands {

    public static void add(Player sender, String userName) {
        /*if(Main.getMongo().getUser("name", userName) != null) {
            UtilPlayer.sendMessage(sender, "&cBöyle bir kullanıcı zaten kayıtlı.");
            return;
        }*/
        Main.getSpring().setUser(new User(userName, UUID.randomUUID().toString()));
        UtilPlayer.sendMessage(sender, "&e" + userName + " &akullanıcısı başarıyla kayıt edildi.");
    }

    public static void setRank(Player sender, String userName, String newRank) {
        if(Main.getSpring().getUser("name", userName) == null) {
            UtilPlayer.sendMessage(sender, "&cBöyle bir kullanıcı bulunamadı.");
            return;
        }
        Rank rank = Rank.valueOf(newRank);
        if(rank.getTag() == null) {
            UtilPlayer.sendMessage(sender, "&cBöyle bir rol bulunamadı.");
            return;
        }
        User user = Main.getSpring().getUser("name", userName);
        user.setRank(rank);
        Main.getSpring().mongoTemplate().save(user);
        UtilPlayer.sendMessage(sender, "&e" + userName + " &akullanıcısına başarıyla "+rank.getTag()+" rolü verildi.");
    }

    public static void setDiscord(Player sender, String userName, String discord) {

    }

    public static void delete(Player sender, String userName) {}

    public static void list(Player sender) {}

}
