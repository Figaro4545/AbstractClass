/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

public class Triangle extends Shape {
    private double z;

    public Triangle(double x, double y, double z) {
        super(x,  y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public void getPerimeter() {
        System.out.println("Периметр треугольника равен: " + (getX() + getY() + z));
    }

    @Override
    public void getSquare() {
        double halfPerimeter = (getX() + getY() + z) / 2;
        double square = Math.sqrt(halfPerimeter * (halfPerimeter - getX()) *
                (halfPerimeter - getY()) * (halfPerimeter - z));
        System.out.println("Площадь треугольника равна: " + String.format("%.3g%n", square));
    }

    @Override
    public void getParameters() {
        System.out.println("1 сторона: " + getX() + " см");
        System.out.println("2 сторона: " + getY() + " см");
        System.out.println("3 сторона: " + getZ() + " см");
    }
}
