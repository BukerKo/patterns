package com.company.factory_method;

import com.company.factory_method.products.Carrot;
import com.company.factory_method.products.Pie;

public class Product {
    
    public static Product getProduct(String parameter) {
        switch (parameter) {
            case "Carrot":
                return new Carrot();
            case "Pie":
                return new Pie();
            default:
                return null;
        }
    }
}
