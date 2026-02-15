package Generics.Dyanamic_Online_Market;

import Generics.Smart_Warehouse_System.Electronics;
import Generics.Smart_Warehouse_System.Furniture;
import Generics.Smart_Warehouse_System.Storage;
import Generics.Smart_Warehouse_System.WildcartUtils;

public class Product <T extends Category>{
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " + name +
                ", Category: " + category.getCategoryName() +
                ", Price: ₹" + price;
    }

    public static <T extends Product<?>> void applyDiscount(T product,double percentage){
        if (percentage <= 0 || percentage > 50) {
            throw new IllegalArgumentException("Discount must be between 1% and 50%");
        }

        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }


}
