package inventorymanagementsystem;

class OrderItem {
    private int productId;
    private int requestedQuantity;

    public OrderItem(int productId, int requestedQuantity) {
        this.productId = productId;
        this.requestedQuantity = requestedQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }
}