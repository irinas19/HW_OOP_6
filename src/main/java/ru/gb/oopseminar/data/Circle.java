package main.java.ru.gb.oopseminar.data;

public class Circle extends Figure implements Length {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public Double length() {
        return 2 * Math.PI * this.radius;
    }

    public Double getRadius() {
        return this.radius;
    }
}