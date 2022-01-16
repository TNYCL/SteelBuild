package com.steel;

import com.steel.database.Spring;
import com.steel.product.ProductCommands;
import com.steel.database.MySQL;
import com.steel.user.UserCommands;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    private static MySQL mysql;
    private static Spring spring;

    @Override
    public void onEnable() {
        instance = this;
        mysql = new MySQL();
        spring = new Spring();

        registerCommands();
        registerListener();
    }

    private void registerCommands() {
        this.getCommand("proje").setExecutor(new ProductCommands());
        this.getCommand("product").setExecutor(new ProductCommands());
        this.getCommand("user").setExecutor(new UserCommands());
        this.getCommand("üye").setExecutor(new UserCommands());
    }

    private void registerListener() {}

    public static Main getInstance() { return instance; }

    public static MySQL getMysql() { return mysql; }

    public static Spring getSpring() { return spring; }

}
