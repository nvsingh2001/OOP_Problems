package InventoryManagementSystem;

class Warehouse {
    private Product[] products;
    private int capacity;
    private int currentSize;

    public Warehouse(int capacity) {
        this.capacity = capacity;
        this.products = new Product[capacity];
        this.currentSize = 0;
    }

    public boolean addProduct(Product product) {
        if (currentSize >= capacity) {
            System.out.println("Warehouse is full. Cannot add product.");
            return false;
        }

        products[currentSize++] = product;
        return true;
    }

    public Product findProductById(int productId) {
        for (int i = 0; i < currentSize; i++) {
            if (products[i].getId() == productId) {
                return products[i];
            }
        }
        return null;
    }

    public boolean checkStock(int productId, int quantity) {
        Product product = findProductById(productId);
        return product != null && product.getQuantity() >= quantity;
    }

    public boolean reserveStock(int productId, int quantity) {
        Product product = findProductById(productId);
        if (product != null && product.getQuantity() >= quantity) {
            return product.reduceQuantity(quantity);
        }
        return false;
    }

    public void displayInventory() {
        System.out.println("\n=== Warehouse Inventory ===");
        for (int i = 0; i < currentSize; i++) {
            System.out.println(products[i]);
        }
        System.out.println("===========================\n");
    }
}
