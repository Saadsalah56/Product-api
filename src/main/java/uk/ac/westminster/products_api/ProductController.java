package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id) {
//        return new Product(id, "Laptop", 999.99);
        Product product = new Product(5L, "Laptop", 500.00);

        product.setPrice(-200.00);
        product.setPrice(750.00);

        System.out.println(product.getPrice());
        return product;
    }
}
