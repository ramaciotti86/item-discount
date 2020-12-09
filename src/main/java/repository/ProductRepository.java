package repository;

import model.Product;
import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    private static Map<String, Product> products = new HashMap<>();

    static {
        products.put("0001", Product.builder().id("0001").name("Water Bottle").price(24.95).build());
        products.put("0002", Product.builder().id("0002").name("Hoodie").price(65.00).build());
        products.put("0003", Product.builder().id("0003").name("Sticker Set").price(3.99).build());
    }

    public Product findById(String id) {
        if (StringUtils.equals(id, null)){
            return null;
        }
        return products.get(id);
    }
}
