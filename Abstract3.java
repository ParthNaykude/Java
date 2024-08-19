// Abstract Class with Multiple Subclasses
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Abstract3 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        
        rectangle.draw(); // Output: Drawing a rectangle
        circle.draw();    // Output: Drawing a circle
    }
}
