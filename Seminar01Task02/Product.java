package Seminar01Task02;

public class Product {
    private int cost;
    private String title;

    public Product(String title, int cost) {
        if (title.isEmpty()) {
            throw new AssertionError("Ошибка в описании продукта");
        } else {
            this.title = title;
        }
        if (cost <= 0) {
            throw new AssertionError("Ошибка в цене продукта");
        } else {
            this.cost = cost;

        }
    }

    public Integer getCost() {
            return this.cost;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
