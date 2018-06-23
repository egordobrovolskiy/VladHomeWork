package lesson2.rectangle;

public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getSquare() {
        return width*height;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
