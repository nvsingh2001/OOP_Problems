package restaurant;

public class Pizza extends FoodItem {
    public Pizza(){
        super("Pizza",
                300.00,
                15,
                15,
                new String[]{"Pizza dough",
                        "Tomato sauce",
                        "Mozzarella cheese",
                        "Olive oil",
                        "Salt",
                        "Basil"
                }
        );
    }
}
