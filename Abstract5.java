// Abstract Class with Abstract and Concrete Methods

abstract class Computer {
    abstract void bootUp(); // Abstract method

    void shutDown() { // Concrete method
        System.out.println("Shutting down the computer.");
    }
}

class Laptop extends Computer {
    void bootUp() {
        System.out.println("Laptop is booting up.");
    }
}

public class Abstract5 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.bootUp();   // Output: Laptop is booting up.
        laptop.shutDown(); // Output: Shutting down the computer.
    }
}
