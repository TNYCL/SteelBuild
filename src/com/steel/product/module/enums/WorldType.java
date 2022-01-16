package com.steel.product.module.enums;

public enum WorldType {

    VOID("Boş"),
    FLOAT("Düz");

    private String name;

    WorldType(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

}
