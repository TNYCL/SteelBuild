package com.steel;

public class Settings {

    public static String sqlIP = "185.255.94.243";
    public static String sqlPort = "3306";
    public static String sqlDatabase = "build";
    public static String sqlUser = "TNYCLL";
    public static String sqlPassword = "Tunabir6796.";

    public static String[] owners = {
            "TNYCL"
    };

    public static boolean isAuthorized(String name) {
        for(String owner : owners) {
            if(owner.equalsIgnoreCase(name)) return true;
        }
        return false;
    }

}
