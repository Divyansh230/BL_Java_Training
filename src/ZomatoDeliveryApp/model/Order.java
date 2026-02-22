package ZomatoDeliveryApp.model;

import ZomatoDeliveryApp.stratergies.PaymentStratergy;

import java.util.List;

public abstract class Order {
    private static int nextId=0;

    protected int orderId;
    protected User user;
    protected Restaurant restaurant;
    protected List<Menu> items;
    protected PaymentStratergy paymentStratergy;
    protected double total;
    protected String schedule;

    public Order(){
        this.user=null;
        this.restaurant=null;
        this.paymentStratergy=null;
        this.total=0;
        this.schedule="";
        this.orderId=++nextId;
    }

    public boolean processPayment(double amount){
        if(paymentStratergy!=null){
            paymentStratergy.pay(amount);
            return true;
        }
        System.out.println("Please Choose Payment mode");
        return false;
    }

    public abstract String gettype();

    public int getOrderId() {
        return orderId;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public User getUser(){
        return user;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setMenu(List<Menu> items) {
        this.items = items;
        total=0;
        for(Menu item : items) {
            total += item.getPrice();
        }
    }

    public List<Menu> getMenu() {
        return items;
    }

    public void setPaymentStratergy(PaymentStratergy paymentStratergy) {
        this.paymentStratergy = paymentStratergy;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
