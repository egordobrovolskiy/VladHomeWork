package lesson2.line;

public class LineRunner {

    public static void main(String[] args) {

        Lines lines = createLines();

        System.out.println("Сумма всех линий ===================================");
        System.out.println(lines.gedSumLine());
        System.out.println("Максимальная длина линии ============================");
        System.out.println(lines.getMaxLine());
    }

    private static Lines createLines() {
        Lines result = new Lines();

        Point p1 = new Point(1,6);
        Point p2 = new Point(2,9);
        Point p3 = new Point(1,4);

        Line l1 = new Line(p1, p3);
        Line l2 = new Line(p2, p3);
        Line l3 = new Line(p1, p2);
        Line l4 = new Line(p2, p1);
        Line l5 = new Line(p3, p2);
        result.addLine(l1);
        result.addLine(l2);
        result.addLine(l3);
        result.addLine(l4);
        result.addLine(l5);

        return result;
    }
}
