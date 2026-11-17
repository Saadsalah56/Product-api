```mermaid
classDiagram

    class Product {
        -Long id
        -String name
        -double price
        +Product()
        +Product(Long id, String name, double price)
        +getId() Long
        +setId(Long id) void
        +getName() String
        +setName(String name) void
        +getPrice() double
        +setPrice(double price) void
    }

    class ProductService {
        -List~Product~ products
        -Long nextId
        +getAllProducts() List~Product~
        +addProduct(Product product) Product
        +getProductById(Long id) Optional~Product~
        +deleteProduct(Long id) void
        +findByName(String name) List~Product~
    }

    class ProductController {
        -ProductService productService
        +getAllProducts() List~Product~
        +getProductById(Long id) Product
        +addProduct(Product product) Product
        +deleteProduct(Long id) void
        +search(String name) List~Product~
    }

    ProductController ..> ProductService : uses
    ProductService --> Product : manages
```