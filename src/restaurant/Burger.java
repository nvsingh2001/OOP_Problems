package restaurant;

public class Burger extends FoodItem {
    public Burger() {
        super("Burger",
                150.00,
                10,
                10,
                new String[]{"Burger Bum",
                        "Lettuce",
                        "Tomato",
                        "Onion",
                        "Cheese slice",
                        "Patty (veg or chicken)",
                        "Mayonnaise",
                        "Ketchup"
                }
        );
    }
}

