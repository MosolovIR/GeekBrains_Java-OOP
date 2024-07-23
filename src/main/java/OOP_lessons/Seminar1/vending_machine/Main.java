package OOP_lessons.Seminar1.vending_machine;

import OOP_lessons.Seminar1.vending_machine.product.Product;
import OOP_lessons.Seminar1.vending_machine.product.Bottle;
import OOP_lessons.Seminar1.vending_machine.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product("Lays", 90);
        Product product2 = new Bottle("Coca-cola", 120, 2);
        Product product3 = new Product("Twix", 100);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine);
    }
}
