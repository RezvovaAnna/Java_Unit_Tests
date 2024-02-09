package Seminar01Task02;

import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    public void getSortedListProducts() {
        Collections.sort(products, (p1, p2) -> Double.compare(p1.getCost(), p2.getCost()));
    }

    public Product getMostExpensiveProduct() {
        if (products.isEmpty()) {
            return null;
        }
        return Collections.max(products, (p1, p2) -> Double.compare(p1.getCost(), p2.getCost()));
    }


    public void printProducts() {
        for (Product product : products) {
            System.out.println("Name: " + product.getTitle() + ", Price: " + product.getCost());
        }
    }
}
