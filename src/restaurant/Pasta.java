package restaurant;

public class Pasta extends FoodItem {
    public Pasta() {
        super("Pasta",
                250.00,
                10,
                15,
                new String[]{"Pasta (penne or spaghetti)",
                    "Olive oil",
                    "Garlic",
                    "Onion",
                    "Tomato or cream",
                    "Salt",
                    "Black pepper",
                    "Cheese",
                    "Herbs (oregano, basil)"
                }
        );
    }
}
