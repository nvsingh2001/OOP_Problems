package zoosimulation;

public class Tiger implements Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eating");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger is roaring!");
    }
}
