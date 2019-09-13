package br.com.sherlock.java;

import br.com.sherlock.java.utilities.MathHelper;

public class Main {

    public static void main(String[] args) {

        MathHelper helper = new MathHelper();

        try {
            while (true) {
                int input = helper.addNumber("Digite um numero: ");
                int total = helper.getTotal();
                String message = String.format("Inserido: %d, total = %d", input, total);
                System.out.println(message);
            }
        } catch (NumberFormatException e) {
            System.out.println("Tudo feito!");
        }
    }
}
