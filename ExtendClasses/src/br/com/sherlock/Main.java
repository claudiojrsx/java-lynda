package br.com.sherlock;

import br.com.sherlock.model.ClothingItem;
import br.com.sherlock.model.Shirt;

public class Main {

    public static void main(String[] args) {

        ClothingItem item = new ClothingItem("Shirt", "L", 19.99);
        System.out.println(item);

        Shirt shirt = new Shirt("M", 14.99);
        System.out.println(shirt);
    }
}
