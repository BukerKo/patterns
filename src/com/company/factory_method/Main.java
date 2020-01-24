package com.company.factory_method;

public class Main {

    public static void main(String[] args) {
        Product product = Product.getProduct(args[0]);
        Oven.cook(product);
    }
}
