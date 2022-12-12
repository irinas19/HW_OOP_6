package main.java.ru.gb.oopseminar.data;

public abstract class Polygon extends Figure implements Perimetr {
    protected Double[] sides;

    protected Polygon(Double[] sides) {
        this.sides = sides;
    }

    public Double perimeter() {
        Double perimeter = 0.0;
        for (Double side : this.sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
