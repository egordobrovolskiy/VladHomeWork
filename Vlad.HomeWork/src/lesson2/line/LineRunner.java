package lesson2.line;

public class LineRunner {

    public static void main(String[] args) {
            Point p1 = new Point(1,6);
            Point p2 = new Point(2,9);
            Point p3 = new Point(1,4);

            Line l1 = new Line(p1, p3);
            Line l2 = new Line(p2, p3);
            Line l3 = new Line(p1, p2);
            Line l4 = new Line(p2, p1);
            Line l5 = new Line(p3, p2);

            Lines lines = new Lines();
            lines.addLine(l1);
            lines.addLine(l2);
            lines.addLine(l3);
            lines.addLine(l4);
            lines.addLine(l5);

        System.out.println(lines.gedSumLine());
        System.out.println(lines.getMaxLine());
    }
}
