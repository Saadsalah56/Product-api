package uk.ac.westminster.products_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.westminster.products_api.model.Address;
import uk.ac.westminster.products_api.model.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {

        Address address = new Address(
                "115 Queen Street",
                "Colombo",
                "W1W 6UW"
        );

        return new Customer(
                id,
                "jon Doe",
                "jondoe5@gmail.com",
                address
        );
    }
}