package zoosimulation;

public class Monkey implements Animal {
    @Override
    public void eat() {
        System.out.println("Monkey eating");
    }

    @Override
    public void sleep() {
        System.out.println("Monkey sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey is howling!");
    }
}
