package org.cucumber;

public class Inventory {

    public GroceryItem getItemByBarCode(String barCode) {
        GroceryItem groceryItem = null;

        if ("1234".equalsIgnoreCase(barCode)) {
            groceryItem =  new GroceryItem();
            groceryItem.setId(1);
            groceryItem.setName("Apple");
        }

        return groceryItem;
    }
}
