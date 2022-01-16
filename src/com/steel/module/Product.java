package com.steel.module;

public class Product {

    private String uuid;
    private String name;
    private String builder;
    private int prices;
    private long startTime;
    private long finishTime;
    private boolean finished;

    public Product(String uuid, String name, String builder, int price, long startTime) {
        this.uuid = uuid;
        this.name = name;
        this.builder = builder;
        this.prices = price;
        this.startTime = startTime;
    }

    public String getUUID() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public String getBuilder() {
        return this.builder;
    }

    public int getPrice() {
        return this.prices;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime= finishTime;
    }

    public void setFinished(boolean finished) { this.finished = finished; }

}
