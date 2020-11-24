package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        Product[] newProducts = new Product[products.length];
        for (int i = 0; i < products.length; i++) {
            if (i < index) {
                newProducts[i] = products[i];
            } else if (i < products.length - 1) {
                newProducts[i] = products[i + 1];
            } else {
                newProducts[i] = null;
            }
        }
        return newProducts;
    }
}
