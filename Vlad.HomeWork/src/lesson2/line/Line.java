package lesson2.line;

public class Line {
    private Point start;
    private Point end;

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    double getLineLength() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(),2) + Math.pow(end.getY() - start.getY(), 2));
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                ", line length=" + getLineLength() +
                '}';
    }
}
