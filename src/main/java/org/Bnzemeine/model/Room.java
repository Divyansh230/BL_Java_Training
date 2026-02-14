package org.Bnzemeine.model;

public abstract class Room {
    protected String roomId;
    protected double price;

    public Room(String roomId,double price){
        this.roomId = roomId;
        this.price = price;
    }

    public String getRoomId() {
        return roomId;
    }
    public double getPrice() {
        return price;
    }
}
