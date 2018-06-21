package lesson2.line;

public class Point {
    private double x;
    private double y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
