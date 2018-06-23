package lesson2.rectangle;

public class RectangleRun {
    public static void main(String[] args) {

        Rectangles rectangles = createRectangles();

        createRectangles();

        System.out.println(rectangles.getSquareAllRectangle());
        System.out.println(rectangles.getSquareAllRectangleStream());
    }

    private static Rectangles createRectangles() {
        Rectangles result = new Rectangles();
        Rectangle rectangle1 = new Rectangle(12, 32);
        Rectangle rectangle2 = new Rectangle(22, 39);
        Rectangle rectangle3 = new Rectangle(32, 21);
        Rectangle rectangle4 = new Rectangle(42, 12);


        result.addRectangle(rectangle1);
        result.addRectangle(rectangle2);
        result.addRectangle(rectangle3);
        result.addRectangle(rectangle4);

        return result;
    }


}
