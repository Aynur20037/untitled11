package Test2;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        System.out.println( " Cat make sound : " );
        cat.makeSound();
        System.out.println( " Dog make sound :");
        dog.makeSound();
    }

}
