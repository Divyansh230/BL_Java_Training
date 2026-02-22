package Solid_Principles.Single_Responsibilty_Principle.Shopping_Cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart<T extends Product> {
   private List<T> cart=new ArrayList<>();

   public void addProduct(T product){
       cart.add(product);
   }

   public List<T> getCart(){
       return cart;
   }
   public double getTotalPrice(){
       double total=0;
       for(Product product:cart){
           total=total+ product.price;
       }
       return total;
   }
}
