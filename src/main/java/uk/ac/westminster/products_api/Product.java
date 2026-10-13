package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    // No-argument constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        setPrice(price);
    }

    // Getter for id
    public Long getId() {
        return id;
    }

    // Temporarily commented out for the experiment
//    public String getName() {
//        return name;
//    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter with price validation
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}