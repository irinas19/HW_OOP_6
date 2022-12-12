package main.java.ru.gb.oopseminar.controller;

import ru.gb.oopseminar.data.*;
import ru.gb.oopseminar.service.FigureRepo;

import java.util.List;

public class Controller {
    private final FigureRepo repository = new FigureRepo();

    public List<Figure> getAllFigure () {
        return repository.getFigures();
    }

    public void createCircle(Double radius) {
        if (radius <= 0)
            throw new IllegalArgumentException("Unable to create a circle: radius <= 0");
        this.repository.add(new Circle(radius));
    }

    public void createTriangle(Double side1, Double side2, Double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            throw new IllegalArgumentException("Unable to create a triangle: side <= 0");
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
            throw new IllegalArgumentException("Unable to create a triangle: sum of the lengths of" +
                    "any two sides must be greater than the lengths of third side");
        this.repository.add(new Triangle(side1, side2, side3));
    }

    public void createRectangle(Double side1, Double side2) {
        if (side1 <= 0 || side2 <= 0)
            throw new IllegalArgumentException("Unable to create a rectangle: side <= 0");
        this.repository.add(new Rectangle(side1, side2));
    }

    public void createSquare(Double side) {
        if (side <= 0)
            throw new IllegalArgumentException("Unable to create a square: side <= 0");
        this.repository.add(new Square(side));
    }

    public Double getAllPerimeters() {
        return this.repository.getAllPerimeters();
    }

    public Double getAllLength() {
        return this.repository.getAllLength();
    }

    public Double getAllAreas() {
        return this.repository.getAllAreas();
    }
}