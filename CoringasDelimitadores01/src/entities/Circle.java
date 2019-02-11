package entities;

public class Circle implements Shape {
    private Double radius;

    public Circle(Double radius) {
        super();
        radius = radius;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
