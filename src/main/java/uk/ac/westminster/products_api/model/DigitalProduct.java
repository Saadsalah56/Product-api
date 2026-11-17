package uk.ac.westminster.products_api.model;

public class DigitalProduct extends Product {
    private String downloadUrl;
    private double fileSizeMB;

    //constructor
//    new DigitalProduct(1L,"Do Some Thing Great",999.99,"/downloads/e-book.pdf",5);

    public DigitalProduct(
            Long id,
            String name,
            double price,
            String downloadUrl,
            double fileSizeMB){

        super(id,name,price);

        this.downloadUrl =downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    //no- argument constructor
    public DigitalProduct(){

    }
/*   Why do we need two constructors?
- DigitalProduct(...) initializes all five values when creating an object with arguments.
- DigitalProduct() allows an object to be created without supplying arguments initially.
*/

    public String getDownloadUrl(){
        return downloadUrl;
    }

    public double getFileSizeMB(){
        return fileSizeMB;
    }

}
