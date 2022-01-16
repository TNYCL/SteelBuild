package com.steel.product.module;

public class Product {

    private String uuid;
    private String name;
    private String builder;
    private String theme;
    private String subject;
    private int price;
    private long deadline;
    private long startTime;
    private long finishTime;
    private boolean finished;

    public Product(String uuid, String name, long startTime) {
        this.uuid = uuid;
        this.name = name;
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

    public String getTheme() { return this.theme; }

    public String getSubject() { return this.subject; }

    public int getPrice() {
        return this.price;
    }

    public long getDeadline() { return this.deadline; }

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

    public void setTheme(String theme) { this.theme = theme; }

    public void setSubject(String subject) { this.subject = subject; }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDeadline(int deadline) { this.deadline = deadline; }

    public void setFinishTime(long finishTime) {
        this.finishTime= finishTime;
    }

    public void setFinished(boolean finished) { this.finished = finished; }

}
