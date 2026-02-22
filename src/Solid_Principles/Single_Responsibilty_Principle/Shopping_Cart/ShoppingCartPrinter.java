package Solid_Principles.Single_Responsibilty_Principle.Shopping_Cart;

import java.util.List;

public class ShoppingCartPrinter {
    ShoppingCart cart = new ShoppingCart();
    List<? extends Product> products=cart.getCart();

   void printList(){
       for(Product product:products){
           System.out.println(product.name);
       }
   }

}
