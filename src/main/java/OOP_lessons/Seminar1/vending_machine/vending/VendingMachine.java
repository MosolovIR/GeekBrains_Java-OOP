package OOP_lessons.Seminar1.vending_machine.vending;

import OOP_lessons.Seminar1.vending_machine.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public int size() {
        return products.size();
    }

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:\n");
        for (Product product : products) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}