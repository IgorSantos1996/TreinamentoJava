package entities;

public class Circle extends Shape {

    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, Double raio) {
        super(color);
        this.radius = raio;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
