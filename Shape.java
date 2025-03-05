//Shape.java
package shapes;

public abstract class Shape {
    public abstract double getArea();

    public void display() {
        System.out.println("Area: " + getArea());
    }
}
