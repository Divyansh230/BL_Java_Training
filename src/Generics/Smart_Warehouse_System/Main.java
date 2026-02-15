package Generics.Smart_Warehouse_System;


public  class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage=new Storage<>();
        electronicsStorage.addItem(new Electronics("Electronics A", 10));
        electronicsStorage.addItem(new Electronics("Electronics B", 20));

        Storage<Furniture> furnitureStorage=new Storage<>();
        furnitureStorage.addItem(new Furniture("Furniture A", 10));
        furnitureStorage.addItem(new Furniture("Furniture B", 20));
        furnitureStorage.addItem(new Furniture("C", 10));

        WildcartUtils.dispaly(furnitureStorage.getItems());
    }

}
