package com.steel.user.module;

import com.steel.user.enums.Rank;

public class User {

    private String name;
    private String uuid;
    private String discordId;
    private Rank rank;

    public User(String name, String uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public String getName() { return this.name; }

    public String getUUID() { return this.uuid; }

    public String getDiscordId() { return this.discordId; }

    public Rank getRank() { return this.rank; }

    public void setDiscordID(String discordId) {
        this.discordId = discordId;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

}
