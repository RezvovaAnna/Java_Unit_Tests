package Seminar01Task02;
import Seminar01Task02.Product;
import org.assertj.core.api.Assertions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ShopTest {
    public static void main(String[] args) {
        Shop testShop = new Shop();
        testShop.setProducts(getShuffleListProducts(getTestListProducts()));
        Assertions.assertThat(testShop.getProducts()).hasSize(4);
        Assertions.assertThat(testShop.getMostExpensiveProduct().getTitle()).isEqualTo(((Product)getTestListProducts().get(3)).getTitle());
        testShop.getSortedListProducts();
        Assertions.assertThat(testShop.getProducts().get(0).getTitle()).isEqualTo("A");
        Assertions.assertThat(testShop.getProducts().get(1).getTitle()).isEqualTo("B");
        Assertions.assertThat(testShop.getProducts().get(2).getTitle()).isEqualTo("C");
    }

    static List<Product> getTestListProducts() {
        Product productA = new Product("A", 100);
        Product productB = new Product("B", 150);
        Product productC = new Product("C", 299);
        Product productD = new Product("D", 500);
        List<Product> productList = new ArrayList<>();
        productList.add(productA);
        productList.add(productB);
        productList.add(productC);
        productList.add(productD);
        return productList;
    }

    static List<Product> getShuffleListProducts(List<Product> productList) {
        Collections.shuffle(productList);
        return productList;
    }

}
