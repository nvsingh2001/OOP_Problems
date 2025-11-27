package zoosimulation;

public class Elephant implements Animal {
    @Override
    public void eat(){
        System.out.println("Elephant is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is trumpeting!");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant sleeping");
    }
}
