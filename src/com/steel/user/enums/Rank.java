package com.steel.user.enums;

public enum Rank {

    BUILDER("&Mimar"),
    MANAGER("&3Manager");

    private String tag;

    Rank(String tag) {
        this.tag = tag;
    }

    public String getTag() { return this.tag; }

}
