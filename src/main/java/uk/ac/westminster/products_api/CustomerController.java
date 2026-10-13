package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable Long id) {

        Address address = new Address(
                "10 Main Street",
                "London",
                "AB1 2CD"
        );

        return new Customer(
                id,
                "Ravi",
                address
        );
    }
}