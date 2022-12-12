package main.java.ru.gb.oopseminar.service;

import ru.gb.oopseminar.data.Figure;

public interface Repository<T extends Figure> {
    public void add(T value);
}