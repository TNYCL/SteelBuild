package com.steel.user;

import com.steel.user.module.User;

import java.util.ArrayList;

public class UserData {

    public static ArrayList<User> joinedUser = new ArrayList<>();

    public static void addUser(User user) {
        joinedUser.add(user);
    }

    public static void removeUser(User user) {
        joinedUser.remove(user);
    }

    public static User getUser(String username) {
        return joinedUser.stream().filter(userModule -> userModule.getName().equals(username)).findFirst().orElse(null);
    }

    public static boolean hasJoined(String username) {
        if(getUser(username) != null) return true;
        return false;
    }

}
