package lesson2.rectangle;

import java.util.ArrayList;
import java.util.List;

public class Rectangles {
    private List<Rectangle> rectangles = new ArrayList<>();

    void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    int getSquareAllRectangle(){
        if (rectangles.isEmpty()) throw new IllegalArgumentException();

        int result = 0;
        for (Rectangle rectangle : rectangles) {
            result += rectangle.getSquare();
        }
        return result;
    }

    int getSquareAllRectangleStream(){
        return rectangles.stream().mapToInt(Rectangle::getSquare).sum();
    }

}
