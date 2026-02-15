package Generics.Smart_Warehouse_System;

import java.util.List;

public class WildcartUtils {

    public static void dispaly(List<? extends WarehouseItem> ls){
        for(WarehouseItem wi : ls){
            System.out.println(wi);
        }
    }
}
