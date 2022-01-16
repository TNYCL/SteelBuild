package com.steel.commands;

import com.steel.commandapi.module.SteelCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Test extends SteelCommand {

    public Test() {
        super(true, "test", null, "deneme", "testkomut");
    }

    @Override
    public void executeCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage("Çalışıyor...");
    }
}
