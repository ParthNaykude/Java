//Abstract Class with Fields and Methods

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    void showBrand() {
        System.out.println("Vehicle brand: " + brand);
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    void start() {
        System.out.println(brand + " car is starting.");
    }
}

public class Abstract4 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car("Toyota");
        vehicle.showBrand(); // Output: Vehicle brand: Toyota
        vehicle.start();     // Output: Toyota car is starting.
    }
}
