package lesson2.rectangle;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        return (width + height) * 2;
    }

    public int getSquare() {
        return width*height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
