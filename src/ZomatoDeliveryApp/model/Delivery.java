package ZomatoDeliveryApp.model;

public class Delivery extends Order{
    private String user_Add;

    public Delivery() {
        user_Add = "";
    }
    public String getUser_Add() {
        return user_Add;
    }
    public void setUser_Add(String user_Add) {
        this.user_Add = user_Add;
    }
    @Override
    public String gettype() {
        return "";
    }
}
