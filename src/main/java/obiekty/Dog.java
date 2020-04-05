package obiekty;

public class Dog implements Animal {

    public void aportuj() {
        // pies aporuje
    }

    @Override
    public void makeSound() {
        System.out.println("HauHau!");
    }
}
