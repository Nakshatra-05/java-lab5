//Cylinder.java
package shapes;

import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public static Cylinder getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();
        System.out.print("Enter height: ");
        double h = scanner.nextDouble();
        return new Cylinder(r, h);
    }
}
