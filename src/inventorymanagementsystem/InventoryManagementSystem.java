package inventorymanagementsystem;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(10);

        warehouse.addProduct(new Product(101, "Laptop", 49999.99, 15));
        warehouse.addProduct(new Product(102, "Mouse", 229.99, 50));
        warehouse.addProduct(new Product(103, "Keyboard", 579.99, 30));
        warehouse.addProduct(new Product(104, "Monitor", 4999.99, 8));
        warehouse.addProduct(new Product(105, "USB Cable", 149.99, 100));

        warehouse.displayInventory();

        Order order1 = new Order(1001, 5);
        order1.addItem(101, 2);
        order1.addItem(102, 3);
        order1.addItem(105, 5);
        order1.processOrder(warehouse);

        warehouse.displayInventory();

        Order order2 = new Order(1002, 5);
        order2.addItem(101, 20);
        order2.processOrder(warehouse);

        Order order3 = new Order(1003, 5);
        order3.addItem(999, 1);
        order3.processOrder(warehouse);

        warehouse.displayInventory();
    }
}
