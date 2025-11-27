package zoosimulation;

public class Zoo {
    public static void main(String[] args) {
        Animal monkey = new Monkey();
        Animal elephant = new Elephant();
        Animal Tiger = new Tiger();
        Animal Lion = new Lion();

        monkey.eat();
        elephant.eat();
        Tiger.eat();
        Lion.eat();

        monkey.sleep();
        elephant.sleep();
        Tiger.sleep();
        Lion.sleep();

        monkey.makeSound();
        elephant.makeSound();
        Tiger.makeSound();
        Lion.makeSound();
    }
}
