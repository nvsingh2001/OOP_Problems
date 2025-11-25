package InventoryManagementSystem;

class Order {
    private int orderId;
    private OrderItem[] items;
    private int itemCount;
    private String status;
    private double totalAmount;

    public Order(int orderId, int maxItems) {
        this.orderId = orderId;
        this.items = new OrderItem[maxItems];
        this.itemCount = 0;
        this.status = "PENDING";
        this.totalAmount = 0.0;
    }

    public boolean addItem(int productId, int quantity) {
        if (itemCount >= items.length) {
            System.out.println("Order is full. Cannot add more items.");
            return false;
        }

        items[itemCount++] = new OrderItem(productId, quantity);
        return true;
    }

    public boolean processOrder(Warehouse warehouse) {
        System.out.println("\n=== Processing Order #" + orderId + " ===");

        // Step 1: Check if all items are available
        for (int i = 0; i < itemCount; i++) {
            OrderItem item = items[i];
            Product product = warehouse.findProductById(item.getProductId());

            if (product == null) {
                System.out.println("FAILED: Product ID " + item.getProductId() + " not found.");
                status = "FAILED";
                return false;
            }

            if (!warehouse.checkStock(item.getProductId(), item.getRequestedQuantity())) {
                System.out.println("FAILED: Insufficient stock for " + product.getName() +
                        ". Requested: " + item.getRequestedQuantity() +
                        ", Available: " + product.getQuantity());
                status = "FAILED";
                return false;
            }
        }

        totalAmount = 0.0;
        for (int i = 0; i < itemCount; i++) {
            OrderItem item = items[i];
            Product product = warehouse.findProductById(item.getProductId());

            warehouse.reserveStock(item.getProductId(), item.getRequestedQuantity());
            double itemTotal = product.getPrice() * item.getRequestedQuantity();
            totalAmount += itemTotal;

            System.out.println("Reserved: " + item.getRequestedQuantity() + "x " +
                    product.getName() + " @ $" + product.getPrice() +
                    " = $" + String.format("%.2f", itemTotal));
        }

        status = "CONFIRMED";
        System.out.println("\nOrder #" + orderId + " CONFIRMED!");
        System.out.println("Total Amount: ₹" + String.format("%.2f", totalAmount));
        System.out.println("============================\n");
        return true;
    }

    public String getStatus() {
        return status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}