package Generics.Dyanamic_Online_Market;

public class Main {

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Mastery", 999, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("Denim Shirt", 1999, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 45000, new GadgetCategory());

        // Apply discounts
        Product.applyDiscount(book, 10);
        Product.applyDiscount(shirt, 20);
        Product.applyDiscount(phone, 5);

        // Catalog
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("📦 Product Catalog:");
        catalog.displayCatalog();
    }
}

