import Seminar01Task01.Calculator;
import Seminar01Task02.Product;
import Seminar01Task02.Shop;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Calculator.ArithmeticException {

        System.out.printf("Результат операции: %s \n", Calculator.calculation(2,1,'/'));
        System.out.printf("Ваша цена со скидкой: %s \n", Calculator.calculatingDiscount(100, 30));

        List<Product> products = new ArrayList<>();
        products.add(new Product("Chair", 600));
        products.add(new Product("Table", 100));
        products.add(new Product("Lamp", 25));

        Shop magazin = new Shop();
        magazin.setProducts(products);

        System.out.println("Список товаров в магазине: ");
        magazin.printProducts();
        Product expensiveProduct = magazin.getMostExpensiveProduct();
        System.out.println("Отсортированный список товаров в магазине: ");
        magazin.getSortedListProducts();
        magazin.printProducts();
        System.out.println("Самый дорогой товар: " + expensiveProduct.getCost() + " "  + expensiveProduct.getTitle());

    }

}

