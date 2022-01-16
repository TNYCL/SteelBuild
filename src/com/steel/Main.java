package com.steel;

import com.steel.database.MySQL;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static MySQL mysql;

    @Override
    public void onLoad() {
        mysql = new MySQL();
    }

    @Override
    public void onEnable() {
        registerCommands();
        registerListener();
    }

    private void registerCommands() {}

    private void registerListener() {}

    public static MySQL getMysql() { return mysql; }

}
