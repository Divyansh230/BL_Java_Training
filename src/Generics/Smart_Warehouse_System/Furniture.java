package Generics.Smart_Warehouse_System;

public class Furniture extends WarehouseItem {

    public Furniture(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {

        return "Furnitures";
    }
}
