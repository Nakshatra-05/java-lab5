//Circle.java
package shapes;

import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static Circle getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();
        return new Circle(r);
    }
}
