// A PhysicalProduct IS-A Product because it is a specific type of product with additional shipping details.
// A ShoppingCart is not a Product because it contains products rather than being a product itself.

package uk.ac.westminster.products_api.model;

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    // No arg constructor
    public PhysicalProduct(){

    }

    //full constructor
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {

        super(id, name, price);

        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }


}
