package br.com.sherlock;

import br.com.sherlock.model.ClothingItem;

public class Main {

    public static void main(String[] args) {

        ClothingItem item = new ClothingItem("Shirt", "L", 19.99);
        System.out.println(item);
    }
}
