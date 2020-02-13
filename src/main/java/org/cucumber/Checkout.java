package org.cucumber;

public class Checkout {

    private static Checkout checkout = null;

    Inventory inventory = new Inventory();

    public GroceryItem getItem(String barCode){
        GroceryItem groceryItem = inventory.getItemByBarCode(barCode);

        return groceryItem;
    }

    private Checkout(){

    }

    public static Checkout getInstance(){

        if (checkout == null){
            checkout = new Checkout();
        }
        return checkout;

    }

    public void sayHellow(){
        System.out.println("Hello World");
    }
}
