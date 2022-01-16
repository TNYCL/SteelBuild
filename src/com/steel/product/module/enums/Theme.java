package com.steel.product.module.enums;

public enum Theme {

    SKYBLOCK("Skyblock"),
    SURVIVAL_SPAWN("Survival Spawn"),
    MINIGAMES("Minigames");

    private String name;

    Theme(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

}
