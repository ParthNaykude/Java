//Abstarct 
abstract class Animal {
    abstract void makeSound(); // Abstract method

    void sleep() { 
        System.out.println("The animal is sleeping.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class Abstarct2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Woof Woof
        dog.sleep();     // Output: The animal is sleeping.
    }
}
