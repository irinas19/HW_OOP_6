package main.java.ru.gb.oopseminar;

import ru.gb.oopseminar.controller.Controller;
import ru.gb.oopseminar.data.Circle;
import ru.gb.oopseminar.data.Rectangle;
import ru.gb.oopseminar.data.Square;
import ru.gb.oopseminar.model.FigureRepo;
import ru.gb.oopseminar.service.FigureRepo;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(20.0);
        System.out.println(square.getSide1() + " " + square.getSide2() + " " + square.area() + " " + square.perimeter());

        Rectangle rectangle = new Rectangle(20.0, 30.0);
        System.out.println(rectangle.getSide1() + " " + rectangle.getSide2() + " " + rectangle.area() + " " + rectangle.perimeter());
        Circle circle = new Circle(10.0);
        System.out.println(circle.getRadius() + " " + circle.area() + " " + circle.length());

        FigureRepo figureRepo = new FigureRepo();
        figureRepo.add(new Rectangle(20.0, 30.0));
        figureRepo.add(new Square(20.0));
        figureRepo.add(new Circle(10.0));


        System.out.println(figureRepo.allAreas());
        System.out.println(figureRepo.allLength());
        System.out.println(figureRepo.allPerimeters());
        Controller controller = new Controller();
        controller.createCircle(10.0);
        controller.createRectangle(30.0, 20.0);
        controller.createSquare(20.0);
        controller.createTriangle(10.0, 10.0, 10.0);
        String out = "\nПериметр всех фигур: " + controller.getAllPerimeters() +
                "\nДлина окружности всех фигур: " + controller.getAllLength() +
                "\nПлощадь всех фигур: " + controller.getAllAreas();
        Logger log = Logger.getLogger(Main.class.getName());
        log.info(out);
    }
}
