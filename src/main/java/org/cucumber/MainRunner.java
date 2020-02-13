package org.cucumber;

public class MainRunner {

    public static void main(String[] args){

        Checkout checkout = Checkout.getInstance();
        checkout.sayHellow();
    }
}
