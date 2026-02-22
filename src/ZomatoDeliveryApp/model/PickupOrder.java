package ZomatoDeliveryApp.model;

public class PickupOrder extends Order {
    private String res_Add;

    public PickupOrder() {
        this.res_Add = "";
    }


    @Override
    public String gettype() {
        return "Pickup";
    }

    public void setRes_Add(String res_Add) {
        this.res_Add = res_Add;
    }

    public String getRes_Add() {
        return res_Add;
    }
}
