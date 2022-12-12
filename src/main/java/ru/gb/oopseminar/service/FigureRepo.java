package main.java.ru.gb.oopseminar.service;

import ru.gb.oopseminar.data.Figure;
import ru.gb.oopseminar.data.Length;
import ru.gb.oopseminar.data.Perimetr;

import java.util.ArrayList;
import java.util.List;

public class FigureRepo implements Repository {
    private List<Figure> figures;

    public FigureRepo() {
        this.figures = new ArrayList<>();
    }

    @Override
    public void add(Figure figure) {
        this.figures.add(figure);
    }

    public Double getAllPerimeters() {
        Double perimeter = 0.0;
        for (Figure figure : this.figures) {
            if (figure instanceof Perimetr) {
                perimeter += ((Perimetr) figure).perimeter();
            }
        }
        return perimeter;
    }

    public Double getAllLength() {
        Double length = 0.0;
        for (Figure figure : this.figures) {
            if (figure instanceof Length) {
                length += ((Length) figure).length();
            }
        }
        return length;
    }

    public Double getAllAreas() {
        Double area = 0.0;
        for (Figure figure : this.figures) {
            area += figure.area();
        }
        return area;
    }

    public List<Figure> getFigures() {
        return figures;
    }

}