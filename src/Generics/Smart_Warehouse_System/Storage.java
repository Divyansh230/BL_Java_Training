package Generics.Smart_Warehouse_System;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WarehouseItem>{
    List<T> storage=new ArrayList<>();

    public void addItem(T item){
        storage.add(item);
    }
    public void removeItem(T item){
        storage.remove(item);
    }

    public T getItem(int index){
        return storage.get(index);
    }

    public List<T> getItems(){
        return storage;
    }
}
