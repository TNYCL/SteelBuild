package com.steel.database;

import com.steel.Settings;
import com.steel.util.UtilLog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {

    private Connection connection;
    private Statement statement;

    public MySQL() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://" + Settings.sqlIP + ":" + Settings.sqlPort + "/" + Settings.sqlDatabase +
                    "?autoReconnect=true", Settings.sqlUser, Settings.sqlPassword);
            this.statement = connection.createStatement();
            UtilLog.log("MySQL bağlantısı sağlandı.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() { return this.connection; }
    public Statement getStatement() { return this.statement; }

}
