package br.com.sherlock;

import br.com.sherlock.utilities.MathHelper;
import br.com.sherlock.utilities.Operation;

public class Main {

    public static void main(String[] args) {

        MathHelper helper = new MathHelper(100);

        try {
            while (true) {
                int input = helper.doMath("Enter a number: ", Operation.ADD);
                int total = helper.getTotal();
                String message = String.format("Entered: %d, total = %d", input, total);
                System.out.println(message);
            }
        } catch (NumberFormatException e) {
            System.out.println("Tudo feito!");
        }
    }
}
