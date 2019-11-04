package modul_5.basicsOfOOP.task_2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shop {

    private List<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public void add (Product product) {
        products.add(product);
    }

    public void setProducts (List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts () {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return products.equals(shop.products);
    }
    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
    @Override
    public String toString() {
        return "Purchase{" +
                "products=" + products +
                '}';
    }
}
